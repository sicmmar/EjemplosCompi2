import Entorno.*;
import Gramatica.*;
import org.antlr.v4.runtime.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class Main {
    public static void main(String[] args) throws IOException {
        String input = "" +
                "subroutine rutina1(param1, param2)\n" +
                    "implicit none\n" +
                    "int, intent(in) :: param1\n" +
                    "int, intent(in) :: param2\n" +
                    "int vvvv1 = 123+78+1111111\n" +
                    "string h = \"hola :3\"" +
                    "imprimir(vvvv1)\n" +
                    "imprimir(param1)\n" +
                    "imprimir(param2)\n" +
                    "imprimir(h)\n" +
                "end subroutine rutina1\n" +

                "subroutine rutina2(p1, p2, p3)\n" +
                    "implicit none\n" +
                    "int, intent(in) :: p1\n" +
                    "int, intent(in) :: p2\n" +
                    "bool, intent(in) :: p3\n" +
                    "int vvvv1 = 123+78+1111111\n" +
                    "string h = \"------ hola desde rutina 2 :D ------\"" +
                    "imprimir(h)\n" +
                    "imprimir(p1)\n" +
                    "imprimir(p2)\n" +
                    "imprimir(\"VARIABLE BOOLEANA:\")\n" +
                    "imprimir(p3)\n" +
                    "imprimir(\">---------------------------------<\")\n" +
                "end subroutine rutina2\n" +

                // LAS LLAVES ABIERTAS Y CERRADAS, SIMULAN EL BLOQUE DE "PROGRAM"
                // EN C3D SERÍA EL MAIN
                "{\n" +

                    "INT vAr1 = 47+123*78/14\n" +
                    "bool flag = .true.\n" +
                    "imPrImir(54+87)\n" +
                    "sTRINg var3 = \"hola mundo >:D\"\n" +
                    "imprimir(flag .and. .true.)\n" +
                    "imprimir(\"LO SIGUIENTE ES LA SUBRUTINA:\")\n" +
                    "call rutina1(var1+3, 19999999)\n" +
                    "IMPRIMIR(\"-------------------------------------------\")\n" +
                    "imprimir(var1)\n" +
                    "imprimir(var3)\n" +
                    "imprimir(vaR1)\n" +
                    "imprimir(\"ACA UN ERROR\")\n" +
                    "" +
                    "INT a = 12\n" +
                    "int x = (a + 3) * (4 - 5) / 2\n" +
                    "imprimir(\"LO SIGUIENTE ES LA X:\")\n" +
                    "imprimir(x)\n" +
                    "CALL RUTINA2 (x, var1, flag)\n" +

                "}\n" +
                "";

        ArrayList<ErrorCompilador> errores = new ArrayList<ErrorCompilador>();
        errores.add(new ErrorCompilador(-1,-1, "DESCRIPCIÓN", null));

        CharStream cs = fromString(input);

        GramaticaLexer lexico = new GramaticaLexer(cs);
        lexico.removeErrorListeners();
        lexico.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            {
                errores.add(new ErrorCompilador(line, charPositionInLine, msg, ErrorCompilador.ErrorTipo.Lexico));
            }
        });
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        GramaticaParser sintactico = new GramaticaParser(tokens);
        sintactico.removeErrorListeners();
        sintactico.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            {
                errores.add(new ErrorCompilador(line, charPositionInLine, msg, ErrorCompilador.ErrorTipo.Sintactico));
            }
        });
        GramaticaParser.StartContext startCtx = sintactico.start();

        // PRIMER PASADA > EJECUCIÓN DE INTÉRPRETE JUNTO CON VALIDACIONES SEMÁNTICAS
        Visitor visitor = new Visitor(new Entorno(null), new Stack<Entorno>(), false);
        visitor.visit(startCtx);
        errores.addAll(visitor.errores);

        String reportError = "digraph E { tabla [label=<<TABLE>";
        for (ErrorCompilador err : errores)
            reportError += err.toString();
        reportError += "</TABLE>>]; }";

        FileWriter file = new FileWriter("errores.dot");
        file.write(reportError);
        file.close();

        Runtime.getRuntime().exec("dot -Tpdf errores.dot -o errores.pdf");

        // SEGUNDA PASADA > GENERACIÓN DE CÓDIGO EN TRES DIRECCIONES
        Visitor para3D = new Visitor(visitor.padre, visitor.pilaEnt, true);
        para3D.visit(startCtx);

        FileWriter file3d = new FileWriter("salida.c");
        file3d.write(para3D.c3d.getHeader() + "\n");
        //System.out.println(para3D.c3d.getHeader());
        for (String ln : para3D.c3d.codigo3d)
            file3d.write(ln + "\n");//System.out.println(ln);

        file3d.close();
    }
}