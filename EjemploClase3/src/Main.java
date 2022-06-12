import Entorno.Entorno;
import Gramatica.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import static org.antlr.v4.runtime.CharStreams.fromString;

public class Main {
    public static void main(String[] args) {
        String input = "" +
                "subroutine rutina1(param1, param2)\n" +
                    "implicit none\n" +
                    "int, intent(in) :: param1\n" +
                    "int, intent(in) :: param2\n" +
                    "int vvvv1 = 123+78+1111111\n" +
                    "imprimir(vvvv1)\n" +
                    "imprimir(param1)\n" +
                    "imprimir(param2)\n" +
                "end subroutine rutina1\n" +

                "int var1 = 54+14*78\n" +
                "imPrImir(54+87)\n" +
                "sTRINg var3 = \"hola mundo >:D\"\n" +
                "imprimir(var1)\n" +

                "{\n" +
                    "iNt var1 = 31\n" +
                    "imprimir(var1)\n" +
                    "{\n" +
                        "imprimir(\"LO SIGUIENTE ES LA SUBRUTINA:\")\n" +
                        "call rutina1(var1+3, var3)\n" +
                        "IMPRIMIR(\"-------------------------------------------\")\n" +
                        "INT vAr1 = 47+123*78/14\n" +
                        "imprimir(var1)\n" +
                        "imprimir(var3)\n" +
                    "}\n" +
                    "imprimir(vaR1)\n" +
                "}\n";

        CharStream cs = fromString(input);

        GramaticaLexer lexico = new GramaticaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        GramaticaParser sintactico = new GramaticaParser(tokens);
        sintactico.removeErrorListeners();
        GramaticaParser.StartContext startCtx = sintactico.start();

        Visitor visitor = new Visitor(new Entorno(null));
        visitor.visit(startCtx);
    }
}