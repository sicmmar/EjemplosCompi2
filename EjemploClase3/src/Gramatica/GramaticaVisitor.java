// Generated from /home/sicmmar/Documents/Compi2/EjemplosCompi2/EjemploClase3/src/Gramatica.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by {@link GramaticaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GramaticaParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#linstrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinstrucciones(GramaticaParser.LinstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(GramaticaParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#subroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine(GramaticaParser.SubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ldeclP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLdeclP(GramaticaParser.LdeclPContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclParameters(GramaticaParser.DeclParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(GramaticaParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr(GramaticaParser.LexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GramaticaParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GramaticaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GramaticaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GramaticaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strExpr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrExpr(GramaticaParser.StrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(GramaticaParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(GramaticaParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(GramaticaParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(GramaticaParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(GramaticaParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(GramaticaParser.IdExprContext ctx);
}