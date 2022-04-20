// Generated from br\u005Cufscar\dc\compiladores\T6.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimuladorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Class=10, Tipo=11, Nivel=12, IDENT=13, COMENTARIO=14, WS=15, ERROR=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"Class", "Tipo", "Nivel", "IDENT", "LITERAL", "COMENTARIO", "WS", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "':'", "','", "'damage type'", "'armor'", "'magic resist'", 
			"'ally'", "';'", "'enemy'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Class", 
			"Tipo", "Nivel", "IDENT", "COMENTARIO", "WS", "ERROR"
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


	public SimuladorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "T6.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 14:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13m\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f|\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u008b\n\r\3\16\6\16\u008e\n\16\r\16\16\16\u008f\3\17"+
		"\3\17\3\20\3\20\7\20\u0096\n\20\f\20\16\20\u0099\13\20\3\20\5\20\u009c"+
		"\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\20!\21#\22\3\2\5"+
		"\4\2C\\c|\5\2\f\f\17\17\177\177\5\2\13\f\17\17\"\"\2\u00ab\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5+\3\2\2\2"+
		"\7-\3\2\2\2\t/\3\2\2\2\13;\3\2\2\2\rA\3\2\2\2\17N\3\2\2\2\21S\3\2\2\2"+
		"\23U\3\2\2\2\25l\3\2\2\2\27{\3\2\2\2\31\u008a\3\2\2\2\33\u008d\3\2\2\2"+
		"\35\u0091\3\2\2\2\37\u0093\3\2\2\2!\u00a0\3\2\2\2#\u00a3\3\2\2\2%&\7e"+
		"\2\2&\'\7n\2\2\'(\7c\2\2()\7u\2\2)*\7u\2\2*\4\3\2\2\2+,\7<\2\2,\6\3\2"+
		"\2\2-.\7.\2\2.\b\3\2\2\2/\60\7f\2\2\60\61\7c\2\2\61\62\7o\2\2\62\63\7"+
		"c\2\2\63\64\7i\2\2\64\65\7g\2\2\65\66\7\"\2\2\66\67\7v\2\2\678\7{\2\2"+
		"89\7r\2\29:\7g\2\2:\n\3\2\2\2;<\7c\2\2<=\7t\2\2=>\7o\2\2>?\7q\2\2?@\7"+
		"t\2\2@\f\3\2\2\2AB\7o\2\2BC\7c\2\2CD\7i\2\2DE\7k\2\2EF\7e\2\2FG\7\"\2"+
		"\2GH\7t\2\2HI\7g\2\2IJ\7u\2\2JK\7k\2\2KL\7u\2\2LM\7v\2\2M\16\3\2\2\2N"+
		"O\7c\2\2OP\7n\2\2PQ\7n\2\2QR\7{\2\2R\20\3\2\2\2ST\7=\2\2T\22\3\2\2\2U"+
		"V\7g\2\2VW\7p\2\2WX\7g\2\2XY\7o\2\2YZ\7{\2\2Z\24\3\2\2\2[\\\7o\2\2\\]"+
		"\7c\2\2]^\7i\2\2^m\7g\2\2_`\7c\2\2`a\7t\2\2ab\7e\2\2bc\7j\2\2cd\7g\2\2"+
		"dm\7t\2\2ef\7y\2\2fg\7c\2\2gh\7t\2\2hi\7t\2\2ij\7k\2\2jk\7q\2\2km\7t\2"+
		"\2l[\3\2\2\2l_\3\2\2\2le\3\2\2\2m\26\3\2\2\2no\7r\2\2op\7j\2\2pq\7{\2"+
		"\2qr\7u\2\2rs\7k\2\2st\7e\2\2tu\7c\2\2u|\7n\2\2vw\7o\2\2wx\7c\2\2xy\7"+
		"i\2\2yz\7k\2\2z|\7e\2\2{n\3\2\2\2{v\3\2\2\2|\30\3\2\2\2}~\7n\2\2~\177"+
		"\7q\2\2\177\u008b\7y\2\2\u0080\u0081\7o\2\2\u0081\u0082\7g\2\2\u0082\u0083"+
		"\7f\2\2\u0083\u0084\7k\2\2\u0084\u0085\7w\2\2\u0085\u008b\7o\2\2\u0086"+
		"\u0087\7j\2\2\u0087\u0088\7k\2\2\u0088\u0089\7i\2\2\u0089\u008b\7j\2\2"+
		"\u008a}\3\2\2\2\u008a\u0080\3\2\2\2\u008a\u0086\3\2\2\2\u008b\32\3\2\2"+
		"\2\u008c\u008e\5\35\17\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\34\3\2\2\2\u0091\u0092\t\2\2"+
		"\2\u0092\36\3\2\2\2\u0093\u0097\7}\2\2\u0094\u0096\n\3\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\7\17\2\2\u009b\u009a\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\177\2\2\u009e"+
		"\u009f\b\20\2\2\u009f \3\2\2\2\u00a0\u00a1\t\4\2\2\u00a1\u00a2\b\21\3"+
		"\2\u00a2\"\3\2\2\2\u00a3\u00a4\13\2\2\2\u00a4$\3\2\2\2\t\2l{\u008a\u008f"+
		"\u0097\u009b\4\3\20\2\3\21\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}