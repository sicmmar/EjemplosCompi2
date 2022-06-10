// Generated from /home/sicmmar/Documents/Compi2/EjemplosCompi2/EjemploClase3/src/Gramatica.g4 by ANTLR 4.10.1
package Gramatica;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, INT=19, IDEN=20, STRING=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "INT", "IDEN", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'implicit'", "'none'", "'subroutine'", "'('", "')'", "'end'", 
			"','", "'imprimir'", "';'", "'{'", "'}'", "'='", "'int'", "'string'", 
			"'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "INT", "IDEN", "STRING", "WS"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u0090\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0004\u0012v\b\u0012\u000b\u0012\f\u0012"+
		"w\u0001\u0013\u0004\u0013{\b\u0013\u000b\u0013\f\u0013|\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0083\b\u0014\n\u0014\f\u0014"+
		"\u0086\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015\u008b\b"+
		"\u0015\u000b\u0015\f\u0015\u008c\u0001\u0015\u0001\u0015\u0000\u0000\u0016"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001"+
		"\u0000\u0013\u0002\u0000IIii\u0002\u0000MMmm\u0002\u0000PPpp\u0002\u0000"+
		"LLll\u0002\u0000CCcc\u0002\u0000TTtt\u0002\u0000NNnn\u0002\u0000OOoo\u0002"+
		"\u0000EEee\u0002\u0000SSss\u0002\u0000UUuu\u0002\u0000BBbb\u0002\u0000"+
		"RRrr\u0002\u0000DDdd\u0002\u0000GGgg\u0001\u000009\u0004\u000009AZ__a"+
		"z\u0003\u0000\n\n\r\r\"\"\u0003\u0000\t\n\r\r  \u0094\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u00036\u0001\u0000\u0000\u0000"+
		"\u0005;\u0001\u0000\u0000\u0000\u0007F\u0001\u0000\u0000\u0000\tH\u0001"+
		"\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000\u0000\rN\u0001\u0000\u0000"+
		"\u0000\u000fP\u0001\u0000\u0000\u0000\u0011Y\u0001\u0000\u0000\u0000\u0013"+
		"[\u0001\u0000\u0000\u0000\u0015]\u0001\u0000\u0000\u0000\u0017_\u0001"+
		"\u0000\u0000\u0000\u0019a\u0001\u0000\u0000\u0000\u001be\u0001\u0000\u0000"+
		"\u0000\u001dl\u0001\u0000\u0000\u0000\u001fn\u0001\u0000\u0000\u0000!"+
		"p\u0001\u0000\u0000\u0000#r\u0001\u0000\u0000\u0000%u\u0001\u0000\u0000"+
		"\u0000\'z\u0001\u0000\u0000\u0000)~\u0001\u0000\u0000\u0000+\u008a\u0001"+
		"\u0000\u0000\u0000-.\u0007\u0000\u0000\u0000./\u0007\u0001\u0000\u0000"+
		"/0\u0007\u0002\u0000\u000001\u0007\u0003\u0000\u000012\u0007\u0000\u0000"+
		"\u000023\u0007\u0004\u0000\u000034\u0007\u0000\u0000\u000045\u0007\u0005"+
		"\u0000\u00005\u0002\u0001\u0000\u0000\u000067\u0007\u0006\u0000\u0000"+
		"78\u0007\u0007\u0000\u000089\u0007\u0006\u0000\u00009:\u0007\b\u0000\u0000"+
		":\u0004\u0001\u0000\u0000\u0000;<\u0007\t\u0000\u0000<=\u0007\n\u0000"+
		"\u0000=>\u0007\u000b\u0000\u0000>?\u0007\f\u0000\u0000?@\u0007\u0007\u0000"+
		"\u0000@A\u0007\n\u0000\u0000AB\u0007\u0005\u0000\u0000BC\u0007\u0000\u0000"+
		"\u0000CD\u0007\u0006\u0000\u0000DE\u0007\b\u0000\u0000E\u0006\u0001\u0000"+
		"\u0000\u0000FG\u0005(\u0000\u0000G\b\u0001\u0000\u0000\u0000HI\u0005)"+
		"\u0000\u0000I\n\u0001\u0000\u0000\u0000JK\u0007\b\u0000\u0000KL\u0007"+
		"\u0006\u0000\u0000LM\u0007\r\u0000\u0000M\f\u0001\u0000\u0000\u0000NO"+
		"\u0005,\u0000\u0000O\u000e\u0001\u0000\u0000\u0000PQ\u0007\u0000\u0000"+
		"\u0000QR\u0007\u0001\u0000\u0000RS\u0007\u0002\u0000\u0000ST\u0007\f\u0000"+
		"\u0000TU\u0007\u0000\u0000\u0000UV\u0007\u0001\u0000\u0000VW\u0007\u0000"+
		"\u0000\u0000WX\u0007\f\u0000\u0000X\u0010\u0001\u0000\u0000\u0000YZ\u0005"+
		";\u0000\u0000Z\u0012\u0001\u0000\u0000\u0000[\\\u0005{\u0000\u0000\\\u0014"+
		"\u0001\u0000\u0000\u0000]^\u0005}\u0000\u0000^\u0016\u0001\u0000\u0000"+
		"\u0000_`\u0005=\u0000\u0000`\u0018\u0001\u0000\u0000\u0000ab\u0007\u0000"+
		"\u0000\u0000bc\u0007\u0006\u0000\u0000cd\u0007\u0005\u0000\u0000d\u001a"+
		"\u0001\u0000\u0000\u0000ef\u0007\t\u0000\u0000fg\u0007\u0005\u0000\u0000"+
		"gh\u0007\f\u0000\u0000hi\u0007\u0000\u0000\u0000ij\u0007\u0006\u0000\u0000"+
		"jk\u0007\u000e\u0000\u0000k\u001c\u0001\u0000\u0000\u0000lm\u0005*\u0000"+
		"\u0000m\u001e\u0001\u0000\u0000\u0000no\u0005/\u0000\u0000o \u0001\u0000"+
		"\u0000\u0000pq\u0005+\u0000\u0000q\"\u0001\u0000\u0000\u0000rs\u0005-"+
		"\u0000\u0000s$\u0001\u0000\u0000\u0000tv\u0007\u000f\u0000\u0000ut\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000x&\u0001\u0000\u0000\u0000y{\u0007\u0010\u0000"+
		"\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}(\u0001\u0000\u0000\u0000~\u0084"+
		"\u0005\"\u0000\u0000\u007f\u0083\b\u0011\u0000\u0000\u0080\u0081\u0005"+
		"\"\u0000\u0000\u0081\u0083\u0005\"\u0000\u0000\u0082\u007f\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005\"\u0000\u0000\u0088*\u0001\u0000\u0000"+
		"\u0000\u0089\u008b\u0007\u0012\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0006\u0015\u0000\u0000\u008f,\u0001\u0000\u0000\u0000"+
		"\u0006\u0000w|\u0082\u0084\u008c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}