import Codigo3D.CodigoTresD;
import Entorno.*;
import Entorno.Simbolo.*;
import Gramatica.*;
import Tipos.Subrutina;

import java.util.ArrayList;
import java.util.Stack;

public class Visitor extends GramaticaBaseVisitor<Object> {

    Stack<Entorno> pilaEnt;
    boolean is3d;
    Entorno padre;
    ArrayList<ErrorCompilador> errores = new ArrayList<ErrorCompilador>();
    CodigoTresD c3d = new CodigoTresD();

    public Visitor(Entorno ent, Stack<Entorno> pilaEnt, boolean is3d) {
        this.pilaEnt = pilaEnt;
        this.pilaEnt.push(ent);
        this.is3d = is3d;
        this.padre = ent;
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
        if (!is3d)
        {
            if (ctx.id1.getText().equals(ctx.id2.getText()))
            {
                if(!pilaEnt.peek().TablaSimbolo.containsKey((ctx.id1.getText() + TipoSimbolo.Subrutina.name()).toUpperCase()))
                {
                    ArrayList<Simbolo> parametros = new ArrayList<Simbolo>();
                    int pos = -1;
                    for(GramaticaParser.ExprContext expCtx : ctx.lexpr().expr())
                        parametros.add(new Simbolo(expCtx.getText(), "", null, TipoSimbolo.Parametros,
                                pos++));

                    Subrutina subr = new Subrutina(ctx.id1.getText(), parametros, ctx.linstrucciones(), ctx.ldeclP());
                    pilaEnt.peek().nuevoSimbolo(ctx.id1.getText() + TipoSimbolo.Subrutina.name(),
                            new Simbolo(ctx.id1.getText(), "Subrutina", subr, TipoSimbolo.Subrutina,
                                    pilaEnt.peek().ultPosicion));
                    pilaEnt.peek().ultPosicion++;
                    return true;
                }
            }
            errores.add(new ErrorCompilador(ctx.id1.getLine(), ctx.id1.getCharPositionInLine(),
                    "Los identificadores de la subrutina no coinciden", ErrorCompilador.ErrorTipo.Semantico));
        }
        return true;
    }

    public Object visitCall(GramaticaParser.CallContext ctx)
    {
        Entorno ent = pilaEnt.peek();
        if (!is3d)
        {
            Simbolo simbRutina = ent.Buscar(ctx.IDEN().getText() + TipoSimbolo.Subrutina.name());
            if (simbRutina == null) errores.add(new ErrorCompilador(ctx.IDEN().getSymbol().getLine(),
                    ctx.IDEN().getSymbol().getCharPositionInLine(), "La subrutina " + ctx.IDEN().getText() + " no existe.",
                    ErrorCompilador.ErrorTipo.Semantico));
            else
            {
                Entorno entSubr = new Entorno(ent);
                Subrutina subr = (Subrutina) simbRutina.valor;
                if (subr.lparametros.size() == ctx.lexpr().expr().size() && subr.lparametros.size() == subr.ldeclaracionParam.getChildCount())
                {
                    for (int i = 0; i < ctx.lexpr().expr().size(); i++)
                    {
                        Simbolo v = (Simbolo)visit(ctx.lexpr().expr().get(i));
                        subr.lparametros.get(i).valor = v.valor;
                        subr.lparametros.get(i).tipo = subr.ldeclaracionParam.declParameters(i).type().getText().toUpperCase();
                        entSubr.nuevoSimbolo(subr.lparametros.get(i).identificador + TipoSimbolo.Variable.name(),
                                subr.lparametros.get(i));
                    }

                    entSubr.ultPosicion = subr.lparametros.size();
                    pilaEnt.push(entSubr);
                    visitLinstrucciones((GramaticaParser.LinstruccionesContext)subr.linstrucciones);
                    pilaEnt.pop();
                } else errores.add(new ErrorCompilador(ctx.IDEN().getSymbol().getLine(), ctx.IDEN().getSymbol().getCharPositionInLine(),
                        "La cantidad de parámetros no coincide.", ErrorCompilador.ErrorTipo.Semantico));
            }
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
        Simbolo s = (Simbolo)visit(ctx.expr());
        if (!is3d)
        {
            System.out.println(s.valor);
        }
        return true;
    }

    public Object visitBlock(GramaticaParser.BlockContext ctx)
    {
        Entorno blck;
        if (!is3d)
        {
            blck = new Entorno(pilaEnt.peek());
            pilaEnt.peek().siguiente = blck;
        }
        else blck = pilaEnt.peek().siguiente;

        pilaEnt.push(blck);
        visitLinstrucciones(ctx.linstrucciones());
        pilaEnt.pop();
        return true;
    }

    public Object visitDeclaration(GramaticaParser.DeclarationContext ctx)
    {
        Entorno ent = pilaEnt.peek();
        if (!this.is3d)
        {
            if(!ent.TablaSimbolo.containsKey((ctx.IDEN().getText() + TipoSimbolo.Variable.name()).toUpperCase()))
            {
                Simbolo nuevo = (Simbolo)visit(ctx.expr());
                nuevo.identificador = ctx.IDEN().getText();
                nuevo.tipo = ctx.type().getText();
                nuevo.posicion = ent.ultPosicion;
                ent.ultPosicion++;
                ent.nuevoSimbolo(ctx.IDEN().getText() + TipoSimbolo.Variable.name(), nuevo);
                return true;
            }
            else errores.add(new ErrorCompilador(ctx.IDEN().getSymbol().getLine(), ctx.IDEN().getSymbol().getCharPositionInLine(),
                    "La variable ya existe en el entorno actual.", ErrorCompilador.ErrorTipo.Semantico));
        }
        else
        {
            // MODO TRES DIRECCIONES
            if (ent.TablaSimbolo.containsKey((ctx.IDEN().getText() + TipoSimbolo.Variable.name()).toUpperCase()))
            {
                Simbolo sim = ent.TablaSimbolo.get((ctx.IDEN().getText() + TipoSimbolo.Variable.name()).toUpperCase());
                // generar c3d de las expresiones -> int :: var1 = 58*7/3+9
                // t1 = 58 * 7;
                // t2 = t1 / 3;
                // t3 = t2 + 9;

                // t4 = 12 + 2;
                // P = t4;
                // STACK[P] = t3; -- 5, 0, 1

                c3d.codigo3d.add(c3d.generateTemporal() + " = " + ent.getPrevSizes() + " + " + sim.posicion + ";");
                c3d.codigo3d.add("P = " + c3d.lastTemporal() + ";");
                c3d.codigo3d.add("STACK[(int)P] = " + sim.valor.toString() + ";");

            }
        }
        return false;
    }

    public String visitType(GramaticaParser.TypeContext ctx)
    {
        return ctx.getText();
    }

    public Object visitOpExpr(GramaticaParser.OpExprContext ctx){
        Simbolo izq = (Simbolo)visit(ctx.left);
        Simbolo der = (Simbolo)visit(ctx.right);
        String operacion = ctx.op.getText();

        switch (operacion.charAt(0))
        {
            case '*' : return new Simbolo("", "INT", (int)izq.valor * (int)der.valor, TipoSimbolo.Variable, -1);
            case '/' : return new Simbolo("", "INT", (int)izq.valor / (int)der.valor, TipoSimbolo.Variable, -1);
            case '+' : return new Simbolo("", "INT", (int)izq.valor + (int)der.valor, TipoSimbolo.Variable, -1);
            case '-' : return new Simbolo("", "INT", (int)izq.valor - (int)der.valor, TipoSimbolo.Variable, -1);
            default: throw new IllegalArgumentException("Operación no válida");
        }

    }

    public Simbolo visitParenExpr(GramaticaParser.ParenExprContext ctx)
    {
        return (Simbolo) visit(ctx.expr());
    }

    public Simbolo visitAtomExpr(GramaticaParser.AtomExprContext ctx)
    {
        return new Simbolo("", "INT", Integer.valueOf(ctx.getText()), TipoSimbolo.Variable, -1);
    }

    public Simbolo visitStrExpr(GramaticaParser.StrExprContext ctx)
    {
        return new Simbolo("", "STRING", String.valueOf(ctx.getText()), TipoSimbolo.Variable, -1);
    }

    public Simbolo visitIdExpr(GramaticaParser.IdExprContext ctx)
    {
        Entorno ent = pilaEnt.peek();
        Simbolo id = ent.Buscar(ctx.IDEN().getText() + TipoSimbolo.Variable.name());
        if (id != null) return id;

        errores.add(new ErrorCompilador(ctx.IDEN().getSymbol().getLine(), ctx.IDEN().getSymbol().getCharPositionInLine(),
                "La variable " + ctx.IDEN().getText() + " no existe.", ErrorCompilador.ErrorTipo.Semantico));
        return null;
    }


}
