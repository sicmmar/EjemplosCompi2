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
        else
        {
            Simbolo sim = pilaEnt.peek().Buscar((ctx.id1.getText() + TipoSimbolo.Subrutina.name()).toUpperCase());
            if (sim != null)
            {
                /*
                SUBR
                    IF
                    DO
                    IF
                FUNC
                SUBR
                PROGRAM
                    call SUBR
                */
                Subrutina subr = (Subrutina) sim.valor;
                c3d.codigo3d.add("void " + subr.nombre.toLowerCase() + "()\n{");
                pilaEnt.push(subr.ent);
                visitLinstrucciones((GramaticaParser.LinstruccionesContext)subr.linstrucciones);
                pilaEnt.pop();
                c3d.codigo3d.add("return;\n}\n");
            }
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
                    subr.ent = pilaEnt.peek();
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
            if (s.tipo.equals("BOOL")) s.valor = (boolean)s.valor ? 'T' : 'F';
            System.out.println(s.valor);
        }
        else
        {
            Entorno ent = pilaEnt.peek();
            /*
            * 1. IMPRIMIR UNA VARIABLE DE TIPO STRING -> IDSTR
            * 2. IMPRIMIR UNA VARIABLE DE TIPO NUMÉRICA -> IDFLOAT
            * 3. IMPRIMIR UN TOKEN DE TIPO NUMÉRICO -> FLOAT
            * 4. IMPRIMIR UN TOKEN DE TIPO STRING -> STR
            * */

            Simbolo sim = null;
            if (s.tipo.toUpperCase().equals("IDSTR") || s.tipo.toUpperCase().equals("IDFLOAT"))
                sim = ent.Buscar(s.identificador + TipoSimbolo.Variable.name());

            switch (s.tipo)
            {
                case "IDSTR":
                    if (sim != null)
                    {
                        c3d.codigo3d.add(c3d.generateTemporal() + " = " + ent.getPrevSizes() + " + " + sim.posicion + ";");
                        c3d.codigo3d.add("P = " + c3d.lastTemporal() + ";");
                        c3d.codigo3d.add("imprimir_variable();");
                    }
                    break;
                case "IDFLOAT":
                    if (sim != null)
                    {
                        c3d.codigo3d.add(c3d.generateTemporal() + " = " + ent.getPrevSizes() + " + " + sim.posicion + ";");
                        c3d.codigo3d.add("P = " + c3d.lastTemporal() + ";");
                        c3d.codigo3d.add("imprimir_var_int();");
                    }
                    break;
                case "FLOAT":
                    c3d.codigo3d.add("printf(\"%f\\n\", " + s.valor + ");");
                    break;
                case "STR":
                    c3d.codigo3d.add("P = " + s.valor + ";");
                    c3d.codigo3d.add("imprimir_string();");
                    break;
            }
        }
        return true;
    }

    public Object visitBlock(GramaticaParser.BlockContext ctx)
    {
        /*Entorno blck;
        if (!is3d)
        {
            blck = new Entorno(pilaEnt.peek());
            pilaEnt.peek().siguiente = blck;
        }
        else blck = pilaEnt.peek().siguiente;

        pilaEnt.push(blck);*/

        if (is3d) c3d.codigo3d.add("int main()\n{\n\n");
        visitLinstrucciones(ctx.linstrucciones());
        //pilaEnt.pop();

        if (is3d) c3d.codigo3d.add("\nreturn 0;\n}");
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
                Simbolo valorLocal = (Simbolo) visit(ctx.expr());
                c3d.codigo3d.add(c3d.generateTemporal() + " = " + ent.getPrevSizes() + " + " + sim.posicion + ";");
                c3d.codigo3d.add("P = " + c3d.lastTemporal() + ";");
                c3d.codigo3d.add("STACK[(int)P] = " + valorLocal.valor + ";");

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

        if (is3d)
        {
            Simbolo sim3d = new Simbolo(TipoSimbolo.C3D, c3d.generateTemporal(), "FLOAT");
            c3d.codigo3d.add(sim3d.valor + " = " + izq.valor + operacion + der.valor + ";");
            return  sim3d;
        }

        switch (operacion)
        {
            case "*" : return new Simbolo("", "INT", (int)izq.valor * (int)der.valor, TipoSimbolo.Variable, -1);
            case "/" : return new Simbolo("", "INT", (int)izq.valor / (int)der.valor, TipoSimbolo.Variable, -1);
            case "+" : return new Simbolo("", "INT", (int)izq.valor + (int)der.valor, TipoSimbolo.Variable, -1);
            case "-" : return new Simbolo("", "INT", (int)izq.valor - (int)der.valor, TipoSimbolo.Variable, -1);
            case ".OR." :
                return new Simbolo("", "BOOL", (boolean)izq.valor || (boolean)der.valor, TipoSimbolo.Variable, -1);
            case ".AND." :
                return new Simbolo("", "BOOL", (boolean)izq.valor && (boolean)der.valor, TipoSimbolo.Variable, -1);
            default: throw new IllegalArgumentException("Operación no válida");
        }

    }

    public Simbolo visitParenExpr(GramaticaParser.ParenExprContext ctx)
    {
        return (Simbolo) visit(ctx.expr());
    }

    public Simbolo visitBoolExpr(GramaticaParser.BoolExprContext ctx)
    {
        if (!is3d) return new Simbolo("", "BOOL", Boolean.valueOf(ctx.getText()), TipoSimbolo.Variable, -1);
        Simbolo sim3d = new Simbolo(TipoSimbolo.C3D, c3d.generateTemporal(), "FLOAT");
        c3d.codigo3d.add(sim3d.valor + " = " + (Boolean.valueOf(ctx.getText()) ? "1" : "0") + ";");
        return sim3d;
    }
    public Simbolo visitAtomExpr(GramaticaParser.AtomExprContext ctx)
    {
        if (!is3d) return new Simbolo("", "INT", Integer.valueOf(ctx.getText()), TipoSimbolo.Variable, -1);
        Simbolo sim3d = new Simbolo(TipoSimbolo.C3D, c3d.generateTemporal(), "FLOAT");
        c3d.codigo3d.add(sim3d.valor + " = " + ctx.getText() + ";");
        return sim3d;
    }

    public Simbolo visitStrExpr(GramaticaParser.StrExprContext ctx)
    {
        if (!is3d) return new Simbolo("", "STRING", String.valueOf(ctx.getText()), TipoSimbolo.Variable, -1);
        Simbolo sim3d = new Simbolo(TipoSimbolo.C3D, c3d.generateTemporal(), "STR");
        c3d.codigo3d.add(sim3d.valor + " = H;");
        for (char i : String.valueOf(ctx.getText()).toCharArray())
        {
            c3d.codigo3d.add("HEAP[(int)H] = " + (int)i + ";");
            c3d.codigo3d.add("H = H + 1;");
        }
        c3d.codigo3d.add("HEAP[(int)H] = -1;");
        c3d.codigo3d.add("H = H + 1;");
        return sim3d;
    }

    public Simbolo visitIdExpr(GramaticaParser.IdExprContext ctx)
    {
        Entorno ent = pilaEnt.peek();
        Simbolo id = ent.Buscar(ctx.IDEN().getText() + TipoSimbolo.Variable.name());
        if (id == null && !is3d) {
            errores.add(new ErrorCompilador(ctx.IDEN().getSymbol().getLine(), ctx.IDEN().getSymbol().getCharPositionInLine(),
                    "La variable " + ctx.IDEN().getText() + " no existe.", ErrorCompilador.ErrorTipo.Semantico));
            return null;
        }
        else
        {
            if (!is3d) return  id;
            Simbolo sim3d = new Simbolo(TipoSimbolo.C3D, c3d.generateTemporal(),
                    id.tipo.toUpperCase().equals("STRING") ? "IDSTR" : "IDFLOAT");
            sim3d.identificador = ctx.IDEN().getText();

            /*
            * t0 = 12 + 4;
            * P = t0;
            * t1 = STACK[(int)P];
            * */
            c3d.codigo3d.add(c3d.generateTemporal() + "=" + ent.getPrevSizes() + " + " + id.posicion + ";");
            c3d.codigo3d.add("P = " + c3d.lastTemporal() + ";");
            c3d.codigo3d.add(sim3d.valor + "= STACK[(int)P];");
            return sim3d;
        }
    }


}
