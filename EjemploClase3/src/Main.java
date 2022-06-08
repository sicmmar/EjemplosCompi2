import Entorno.Entorno;
import Gramatica.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import static org.antlr.v4.runtime.CharStreams.fromString;

public class Main {
    public static void main(String[] args) {
        String input = "int var1 = 54+17*78;" +
                "imPRimiR(54+17);" +
                "sTRIng var3 = \"hola mundo >:D\";" +
                "imprimir(var1);" +
                "{" +
                    "iNt var1 = 31;" +
                    "imprimir(vAr1);" +
                    "{" +
                        "INT VAR1 = 47+123*78/14;" +
                        "imprimir(var1);" +
                        "imprimir(var3);" +
                    "}" +
                    "imprimir(var1);" +
                "}";

        CharStream cs = fromString(input);

        GramaticaLexer lexico = new GramaticaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        GramaticaParser sintactico = new GramaticaParser(tokens);
        GramaticaParser.StartContext startCtx = sintactico.start();

        Visitor visitor = new Visitor(new Entorno(null));
        visitor.visit(startCtx);
    }
}