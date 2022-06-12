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

    public Object visitStart(GramaticaParser.StartContext ctx)
    {
        return visitLinstrucciones(ctx.linstrucciones());
    }

    public Object visitLinstrucciones(GramaticaParser.LinstruccionesContext ctx)
    {
        for (GramaticaParser.InstruccionesContext ictx : ctx.instrucciones())
            visitInstrucciones(ictx);
        return true;
    }

    public Object visitInstrucciones(GramaticaParser.InstruccionesContext ctx)
    {
        if (ctx.block() != null)
            visitBlock(ctx.block());
        else if (ctx.declaration() != null)
            visitDeclaration(ctx.declaration());
        else if (ctx.print() != null)
            visitPrint(ctx.print());
        else if (ctx.subroutine() != null)
            visitSubroutine(ctx.subroutine());
        else if (ctx.call() != null)
            visitCall(ctx.call());
        return true;
    }

    public Object visitSubroutine(GramaticaParser.SubroutineContext ctx)
    {
        if (ctx.id1.getText().equals(ctx.id2.getText()))
        {
            if(!pilaEnt.peek().TablaSimbolo.containsKey((ctx.id1.getText() + TipoSimbolo.Subrutina.name()).toUpperCase()))
            {
                ArrayList<Simbolo> parametros = new ArrayList<Simbolo>();
                for(GramaticaParser.ExprContext expCtx : ctx.lexpr().expr())
                    parametros.add(new Simbolo(expCtx.getText(), "", null, TipoSimbolo.Parametros));

                Subrutina subr = new Subrutina(ctx.id1.getText(), parametros, ctx.linstrucciones(), ctx.ldeclP());
                pilaEnt.peek().nuevoSimbolo(ctx.id1.getText() + TipoSimbolo.Subrutina.name(),
                        new Simbolo(ctx.id1.getText(), "Subrutina", subr, TipoSimbolo.Subrutina));
                return true;
            }
        }
        throw new RuntimeException("Los identificadores de la subrutina no coinciden");
    }

    public Object visitCall(GramaticaParser.CallContext ctx)
    {
        Entorno ent = pilaEnt.peek();
        Simbolo simbRutina = ent.Buscar(ctx.IDEN().getText() + TipoSimbolo.Subrutina.name());
        if (simbRutina == null) throw new RuntimeException("La subrutina " + ctx.IDEN().getText() + " no existe.");
        else
        {
            Entorno entSubr = new Entorno(ent);
            Subrutina subr = (Subrutina) simbRutina.valor;
            if (subr.lparametros.size() == ctx.lexpr().expr().size() && subr.lparametros.size() == subr.ldeclaracionParam.getChildCount())
            {
                for (int i = 0; i < ctx.lexpr().expr().size(); i++)
                {
                    subr.lparametros.get(i).valor = visit(ctx.lexpr().expr().get(i));
                    subr.lparametros.get(i).tipo = subr.ldeclaracionParam.declParameters(i).type().getText();
                    entSubr.nuevoSimbolo(subr.lparametros.get(i).identificador + TipoSimbolo.Variable.name(),
                            subr.lparametros.get(i));
                }

                pilaEnt.push(entSubr);
                visitLinstrucciones((GramaticaParser.LinstruccionesContext)subr.linstrucciones);
                pilaEnt.pop();
            } else throw  new RuntimeException("La cantidad de parámetros no coincide.");
        }
        return true;
    }

    public Object visitLexpr(GramaticaParser.LexprContext ctx)
    {
        for (GramaticaParser.ExprContext ectx : ctx.expr())
            visit(ectx);
        return true;
    }

    public Object visitPrint(GramaticaParser.PrintContext ctx)
    {
        System.out.println(visit(ctx.expr()));
        return true;
    }

    public Object visitBlock(GramaticaParser.BlockContext ctx)
    {
        pilaEnt.push(new Entorno(pilaEnt.peek()));
        visitLinstrucciones(ctx.linstrucciones());
        pilaEnt.pop();
        return true;
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
        return String.valueOf(ctx.getText());
    }

    public Object visitIdExpr(GramaticaParser.IdExprContext ctx)
    {
        Entorno ent = pilaEnt.peek();
        Simbolo id = ent.Buscar(ctx.IDEN().getText() + TipoSimbolo.Variable.name());
        if (id == null) throw new RuntimeException("La variable " + ctx.IDEN().getText() + " no existe.");
        else return id.valor;
    }


}
