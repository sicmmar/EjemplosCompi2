import Entorno.*;
import Gramatica.*;
import org.antlr.v4.runtime.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class Main {
    public static void main(String[] args) throws IOException {
        String input = "" +
                "subroutine rutina1rrr(param1, param2)\n" +
                    "implicit none\n" +
                    "int, intent(in) :: param1\n" +
                    "int, intent(in) :: param2\n" +
                    "int vvvv1 = 123+78+1111111\n" +
                    "imprimir(vvvv1)\n" +
                    "imprimir(param1\n" +
                    "imprimir(param2)\n" +
                "end subroutine rutina1\n" +

                "int var1 = 54+14*78\n" +
                "imPrImir(54+87)@\n" +
                "sTRINg var3 = \"hola mundo >:D\"\n" +
                "imprimir(var1)\n" +

                "{\n" +
                    "iNt var1 = 31\n" +
                    "imprimir(var1)\n" +
                    "{\n" +
                        "imprimir(\"LO SIGUIENTE ES LA SUBRUTINA:\")\n" +
                        "call rutina1(var1+3 var3)\n" +
                        "IMPRIMIR\"-------------------------------------------\")\n" +
                        "INT # vAr1 = 47+123*78/14\n" +
                        "imprimir(var1)\n" +
                        "imprimir(var3)\n" +
                    "}\n" +
                    "imprimirvaR1)\n" +
                "}\n";

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

        Visitor visitor = new Visitor(new Entorno(null));
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
    }
}