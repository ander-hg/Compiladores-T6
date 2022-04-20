// Generated from br\u005Cufscar\dc\compiladores\T6.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link T6Parser}.
 */
public interface T6Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link T6Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(T6Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T6Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(T6Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T6Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(T6Parser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T6Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(T6Parser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T6Parser#personagem}.
	 * @param ctx the parse tree
	 */
	void enterPersonagem(T6Parser.PersonagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link T6Parser#personagem}.
	 * @param ctx the parse tree
	 */
	void exitPersonagem(T6Parser.PersonagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link T6Parser#aliado}.
	 * @param ctx the parse tree
	 */
	void enterAliado(T6Parser.AliadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T6Parser#aliado}.
	 * @param ctx the parse tree
	 */
	void exitAliado(T6Parser.AliadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T6Parser#inimigo}.
	 * @param ctx the parse tree
	 */
	void enterInimigo(T6Parser.InimigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T6Parser#inimigo}.
	 * @param ctx the parse tree
	 */
	void exitInimigo(T6Parser.InimigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T6Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(T6Parser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link T6Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(T6Parser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link T6Parser#cmdSkill}.
	 * @param ctx the parse tree
	 */
	void enterCmdSkill(T6Parser.CmdSkillContext ctx);
	/**
	 * Exit a parse tree produced by {@link T6Parser#cmdSkill}.
	 * @param ctx the parse tree
	 */
	void exitCmdSkill(T6Parser.CmdSkillContext ctx);
}