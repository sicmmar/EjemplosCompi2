import Gramatica.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class Main {
    public static void main(String[] args) {
        String input = "(789798)";
        CharStream cs = fromString(input);

        GramaticaLexer lexico = new GramaticaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        GramaticaParser sintactico = new GramaticaParser(tokens);
        GramaticaParser.InicioContext arbol = sintactico.inicio();

        Visitor visitor = new Visitor();
        visitor.visit(arbol);
    }
}