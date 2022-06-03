// Generated from /home/sicmmar/Documents/Compi2/EjemploLab2/Gramatica.g4 by ANTLR 4.10.1
package Gramatica;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(GramaticaParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(GramaticaParser.EContext ctx);
}