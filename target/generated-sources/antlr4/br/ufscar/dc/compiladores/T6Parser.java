// Generated from br\u005Cufscar\dc\compiladores\T6.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class T6Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, Tipo=14, Nivel=15, Skill=16, Class=17, 
		IDENT=18, COMENTARIO=19, WS=20, ERROR=21;
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_personagem = 2, RULE_aliado = 3, 
		RULE_inimigo = 4, RULE_cmd = 5, RULE_cmdSkill = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "corpo", "personagem", "aliado", "inimigo", "cmd", "cmdSkill"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'name'", "':'", "','", "'damage type'", "'armor'", "'magic resist'", 
			"'skill'", "'ally'", "';'", "'enemy'", "'use'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Tipo", "Nivel", "Skill", "Class", "IDENT", "COMENTARIO", 
			"WS", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "T6.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public T6Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T6Visitor ) return ((T6Visitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			corpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public AliadoContext aliado() {
			return getRuleContext(AliadoContext.class,0);
		}
		public InimigoContext inimigo() {
			return getRuleContext(InimigoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T6Visitor ) return ((T6Visitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			aliado();
			setState(17);
			inimigo();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(18);
				cmd();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersonagemContext extends ParserRuleContext {
		public Token id;
		public Token armor;
		public Token mr;
		public TerminalNode Class() { return getToken(T6Parser.Class, 0); }
		public TerminalNode Tipo() { return getToken(T6Parser.Tipo, 0); }
		public TerminalNode IDENT() { return getToken(T6Parser.IDENT, 0); }
		public List<TerminalNode> Nivel() { return getTokens(T6Parser.Nivel); }
		public TerminalNode Nivel(int i) {
			return getToken(T6Parser.Nivel, i);
		}
		public TerminalNode Skill() { return getToken(T6Parser.Skill, 0); }
		public PersonagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).enterPersonagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).exitPersonagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T6Visitor ) return ((T6Visitor<? extends T>)visitor).visitPersonagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonagemContext personagem() throws RecognitionException {
		PersonagemContext _localctx = new PersonagemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_personagem);
		int _la;
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				((PersonagemContext)_localctx).id = match(Class);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(T__0);
				setState(26);
				match(T__1);
				setState(27);
				((PersonagemContext)_localctx).id = match(IDENT);
				setState(28);
				match(T__2);
				setState(29);
				match(T__3);
				setState(30);
				match(T__1);
				setState(31);
				match(Tipo);
				setState(32);
				match(T__2);
				setState(33);
				match(T__4);
				setState(34);
				match(T__1);
				setState(35);
				((PersonagemContext)_localctx).armor = match(Nivel);
				setState(36);
				match(T__2);
				setState(37);
				match(T__5);
				setState(38);
				match(T__1);
				setState(39);
				((PersonagemContext)_localctx).mr = match(Nivel);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(40);
					match(T__2);
					setState(41);
					match(T__6);
					setState(42);
					match(T__1);
					setState(43);
					match(Skill);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliadoContext extends ParserRuleContext {
		public PersonagemContext personagem() {
			return getRuleContext(PersonagemContext.class,0);
		}
		public AliadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).enterAliado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).exitAliado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T6Visitor ) return ((T6Visitor<? extends T>)visitor).visitAliado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliadoContext aliado() throws RecognitionException {
		AliadoContext _localctx = new AliadoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_aliado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__7);
			setState(49);
			personagem();
			setState(50);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InimigoContext extends ParserRuleContext {
		public PersonagemContext personagem() {
			return getRuleContext(PersonagemContext.class,0);
		}
		public InimigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inimigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).enterInimigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).exitInimigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T6Visitor ) return ((T6Visitor<? extends T>)visitor).visitInimigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InimigoContext inimigo() throws RecognitionException {
		InimigoContext _localctx = new InimigoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inimigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__9);
			setState(53);
			personagem();
			setState(54);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdSkillContext cmdSkill() {
			return getRuleContext(CmdSkillContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T6Visitor ) return ((T6Visitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			cmdSkill();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSkillContext extends ParserRuleContext {
		public TerminalNode Skill() { return getToken(T6Parser.Skill, 0); }
		public CmdSkillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSkill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).enterCmdSkill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof T6Listener ) ((T6Listener)listener).exitCmdSkill(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof T6Visitor ) return ((T6Visitor<? extends T>)visitor).visitCmdSkill(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSkillContext cmdSkill() throws RecognitionException {
		CmdSkillContext _localctx = new CmdSkillContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdSkill);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__10);
			setState(59);
			match(T__11);
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(61);
			match(T__2);
			setState(62);
			match(Skill);
			setState(63);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\5\4\61\n\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n"+
		"\f\16\2\3\4\2\n\n\f\f\2?\2\20\3\2\2\2\4\22\3\2\2\2\6\60\3\2\2\2\b\62\3"+
		"\2\2\2\n\66\3\2\2\2\f:\3\2\2\2\16<\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2"+
		"\22\23\5\b\5\2\23\27\5\n\6\2\24\26\5\f\7\2\25\24\3\2\2\2\26\31\3\2\2\2"+
		"\27\25\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\27\3\2\2\2\32\61\7\23\2\2"+
		"\33\34\7\3\2\2\34\35\7\4\2\2\35\36\7\24\2\2\36\37\7\5\2\2\37 \7\6\2\2"+
		" !\7\4\2\2!\"\7\20\2\2\"#\7\5\2\2#$\7\7\2\2$%\7\4\2\2%&\7\21\2\2&\'\7"+
		"\5\2\2\'(\7\b\2\2()\7\4\2\2).\7\21\2\2*+\7\5\2\2+,\7\t\2\2,-\7\4\2\2-"+
		"/\7\22\2\2.*\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60\32\3\2\2\2\60\33\3\2\2\2"+
		"\61\7\3\2\2\2\62\63\7\n\2\2\63\64\5\6\4\2\64\65\7\13\2\2\65\t\3\2\2\2"+
		"\66\67\7\f\2\2\678\5\6\4\289\7\13\2\29\13\3\2\2\2:;\5\16\b\2;\r\3\2\2"+
		"\2<=\7\r\2\2=>\7\16\2\2>?\t\2\2\2?@\7\5\2\2@A\7\22\2\2AB\7\17\2\2B\17"+
		"\3\2\2\2\5\27.\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}