import Entorno.*;
import Entorno.Simbolo.*;
import Gramatica.*;
import Tipos.Subrutina;

import java.util.ArrayList;
import java.util.Stack;

public class Visitor extends GramaticaBaseVisitor<Object> {

    Stack<Entorno> pilaEnt = new Stack<Entorno>();

    public Visitor(Entorno ent) {
        this.pilaEnt.push(ent);
    }

    public Object visitSubroutine(GramaticaParser.SubroutineContext ctx)
    {
        if (ctx.id1.getText().equals(ctx.id2.getText()))
        {
            if(!pilaEnt.peek().TablaSimbolo.containsKey((ctx.id1.getText() + TipoSimbolo.Subrutina.name()).toUpperCase()))
            {
                ArrayList<Simbolo> parametros = new ArrayList<Simbolo>();
                for(int i = 0; i < ctx.lexpr().getChildCount(); i++)
                    parametros.add(new Simbolo(visit(ctx.lexpr().expr(i)).toString(), "", null, TipoSimbolo.Parametros));

                Subrutina subr = new Subrutina(ctx.id1.getText(), parametros, ctx.linstrucciones());
                pilaEnt.peek().TablaSimbolo.put(ctx.id1.getText() + TipoSimbolo.Subrutina.name(),
                        new Simbolo(ctx.id1.getText(), "Subrutina", subr, TipoSimbolo.Subrutina-));
                return true;
            }
        }
        throw new RuntimeException("Los identificadores de la subrutina no coinciden");
    }
    public Object visitStart(GramaticaParser.StartContext ctx)
    {
        //System.out.println(visit(ctx.linstrucciones()));
        return visit(ctx.linstrucciones());
    }

    public Object visitBlck(GramaticaParser.BlckContext ctx)
    {
        pilaEnt.push(new Entorno(pilaEnt.peek()));
        visit(ctx.block());
        pilaEnt.pop();
        return true;
    }
    public Object visitBlock(GramaticaParser.BlockContext ctx)
    {
        return visit(ctx.linstrucciones());
    }

    public Object visitDecl(GramaticaParser.DeclContext ctx)
    {
        return visit(ctx.declaration());
    }

    public Object visitDeclaration(GramaticaParser.DeclarationContext ctx)
    {
        Entorno ent = pilaEnt.peek();
        if(!ent.TablaSimbolo.containsKey((ctx.IDEN().getText() + TipoSimbolo.Variable.name()).toUpperCase()))
        {
            Simbolo nuevo = new Simbolo(ctx.IDEN().getText(), ctx.type().getText(), visit(ctx.expr()), TipoSimbolo.Variable );
            ent.nuevoSimbolo(ctx.IDEN().getText() + TipoSimbolo.Variable.name(), nuevo);
            return true;
        }
        else throw new RuntimeException("La variable ya existe en el entorno actual.");
    }

    public String visitType(GramaticaParser.TypeContext ctx)
    {
        return ctx.getText();
    }

    public Object visitOpExpr(GramaticaParser.OpExprContext ctx){
        int izq = (int)visit(ctx.left);
        int der = (int)visit(ctx.right);
        String operacion = ctx.op.getText();

        switch (operacion.charAt(0))
        {
            case '*' : return izq * der;
            case '/' : return izq / der;
            case '+' : return izq + der;
            case '-' : return izq - der;
            default: throw new IllegalArgumentException("Operación no válida");
        }
    }

    public Integer visitAtomExpr(GramaticaParser.AtomExprContext ctx)
    {
        return Integer.valueOf(ctx.getText());
    }

    public String visitStrExpr(GramaticaParser.StrExprContext ctx)
    {
        return String.valueOf(ctx.str.getText());
    }

    public Object visitIdExpr(GramaticaParser.IdExprContext ctx)
    {
        Entorno ent = pilaEnt.peek();
        Simbolo id = ent.Buscar(ctx.IDEN().getText() + TipoSimbolo.Variable.name());
        if (id == null) throw new RuntimeException("La variable " + ctx.IDEN().getText() + " no existe.");
        else return id.valor;
    }

    public Object visitPrint(GramaticaParser.PrintContext ctx)
    {
        System.out.println(visit(ctx.expr()));
        return true;
    }
}
