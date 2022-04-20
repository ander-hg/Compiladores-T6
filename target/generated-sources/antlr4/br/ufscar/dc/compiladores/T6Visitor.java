// Generated from br\u005Cufscar\dc\compiladores\T6.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link T6Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface T6Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link T6Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(T6Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T6Parser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(T6Parser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T6Parser#personagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersonagem(T6Parser.PersonagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link T6Parser#aliado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliado(T6Parser.AliadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T6Parser#inimigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInimigo(T6Parser.InimigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T6Parser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(T6Parser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link T6Parser#cmdSkill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSkill(T6Parser.CmdSkillContext ctx);
}