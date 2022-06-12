// Generated from /home/sicmmar/Documents/Compi2/EjemplosCompi2/EjemploClase3/src/Gramatica.g4 by ANTLR 4.10.1
package Gramatica;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, INTR=16, STRINGR=17, 
		IMPRIMIR=18, SUBR=19, ENDR=20, INTENT=21, IN=22, INT=23, IDEN=24, STRING=25, 
		WS=26;
	public static final int
		RULE_start = 0, RULE_linstrucciones = 1, RULE_instrucciones = 2, RULE_subroutine = 3, 
		RULE_ldeclP = 4, RULE_declParameters = 5, RULE_call = 6, RULE_lexpr = 7, 
		RULE_print = 8, RULE_block = 9, RULE_declaration = 10, RULE_type = 11, 
		RULE_expr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "linstrucciones", "instrucciones", "subroutine", "ldeclP", "declParameters", 
			"call", "lexpr", "print", "block", "declaration", "type", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'\\n'", "'implicit'", "'none'", "','", "':'", "'call'", 
			"'{'", "'}'", "'='", "'*'", "'/'", "'+'", "'-'", "'int'", "'string'", 
			"'imprimir'", "'subroutine'", "'end'", "'intent'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "INTR", "STRINGR", "IMPRIMIR", "SUBR", "ENDR", 
			"INTENT", "IN", "INT", "IDEN", "STRING", "WS"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public LinstruccionesContext linstrucciones() {
			return getRuleContext(LinstruccionesContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			linstrucciones();
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

	public static class LinstruccionesContext extends ParserRuleContext {
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public LinstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linstrucciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitLinstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinstruccionesContext linstrucciones() throws RecognitionException {
		LinstruccionesContext _localctx = new LinstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_linstrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			instrucciones();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << INTR) | (1L << STRINGR) | (1L << IMPRIMIR) | (1L << SUBR))) != 0)) {
				{
				{
				setState(29);
				instrucciones();
				}
				}
				setState(34);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public SubroutineContext subroutine() {
			return getRuleContext(SubroutineContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucciones);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				block();
				}
				break;
			case INTR:
			case STRINGR:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				declaration();
				}
				break;
			case IMPRIMIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				print();
				}
				break;
			case SUBR:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				subroutine();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				call();
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

	public static class SubroutineContext extends ParserRuleContext {
		public Token id1;
		public Token id2;
		public List<TerminalNode> SUBR() { return getTokens(GramaticaParser.SUBR); }
		public TerminalNode SUBR(int i) {
			return getToken(GramaticaParser.SUBR, i);
		}
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public LdeclPContext ldeclP() {
			return getRuleContext(LdeclPContext.class,0);
		}
		public LinstruccionesContext linstrucciones() {
			return getRuleContext(LinstruccionesContext.class,0);
		}
		public TerminalNode ENDR() { return getToken(GramaticaParser.ENDR, 0); }
		public List<TerminalNode> IDEN() { return getTokens(GramaticaParser.IDEN); }
		public TerminalNode IDEN(int i) {
			return getToken(GramaticaParser.IDEN, i);
		}
		public SubroutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSubroutine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineContext subroutine() throws RecognitionException {
		SubroutineContext _localctx = new SubroutineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subroutine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(SUBR);
			setState(43);
			((SubroutineContext)_localctx).id1 = match(IDEN);
			setState(44);
			match(T__0);
			setState(45);
			lexpr();
			setState(46);
			match(T__1);
			setState(47);
			match(T__2);
			setState(48);
			match(T__3);
			setState(49);
			match(T__4);
			setState(50);
			match(T__2);
			setState(51);
			ldeclP();
			setState(52);
			linstrucciones();
			setState(53);
			match(ENDR);
			setState(54);
			match(SUBR);
			setState(55);
			((SubroutineContext)_localctx).id2 = match(IDEN);
			setState(56);
			match(T__2);
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

	public static class LdeclPContext extends ParserRuleContext {
		public List<DeclParametersContext> declParameters() {
			return getRuleContexts(DeclParametersContext.class);
		}
		public DeclParametersContext declParameters(int i) {
			return getRuleContext(DeclParametersContext.class,i);
		}
		public LdeclPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ldeclP; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitLdeclP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LdeclPContext ldeclP() throws RecognitionException {
		LdeclPContext _localctx = new LdeclPContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ldeclP);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(58);
					declParameters();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(61); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclParametersContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INTENT() { return getToken(GramaticaParser.INTENT, 0); }
		public TerminalNode IN() { return getToken(GramaticaParser.IN, 0); }
		public TerminalNode IDEN() { return getToken(GramaticaParser.IDEN, 0); }
		public DeclParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclParametersContext declParameters() throws RecognitionException {
		DeclParametersContext _localctx = new DeclParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			type();
			setState(64);
			match(T__5);
			setState(65);
			match(INTENT);
			setState(66);
			match(T__0);
			setState(67);
			match(IN);
			setState(68);
			match(T__1);
			setState(69);
			match(T__6);
			setState(70);
			match(T__6);
			setState(71);
			match(IDEN);
			setState(72);
			match(T__2);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode IDEN() { return getToken(GramaticaParser.IDEN, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__7);
			setState(75);
			match(IDEN);
			setState(76);
			match(T__0);
			setState(77);
			lexpr();
			setState(78);
			match(T__1);
			setState(79);
			match(T__2);
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

	public static class LexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitLexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexprContext lexpr() throws RecognitionException {
		LexprContext _localctx = new LexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			expr(0);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(82);
				match(T__5);
				setState(83);
				expr(0);
				}
				}
				setState(88);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(GramaticaParser.IMPRIMIR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(IMPRIMIR);
			setState(90);
			match(T__0);
			setState(91);
			expr(0);
			setState(92);
			match(T__1);
			setState(93);
			match(T__2);
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

	public static class BlockContext extends ParserRuleContext {
		public LinstruccionesContext linstrucciones() {
			return getRuleContext(LinstruccionesContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__8);
			setState(96);
			match(T__2);
			setState(97);
			linstrucciones();
			setState(98);
			match(T__9);
			setState(99);
			match(T__2);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDEN() { return getToken(GramaticaParser.IDEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			type();
			setState(102);
			match(IDEN);
			setState(103);
			match(T__10);
			setState(104);
			expr(0);
			setState(105);
			match(T__2);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTR() { return getToken(GramaticaParser.INTR, 0); }
		public TerminalNode STRINGR() { return getToken(GramaticaParser.STRINGR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==INTR || _la==STRINGR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrExprContext extends ExprContext {
		public Token str;
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public StrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public TerminalNode IDEN() { return getToken(GramaticaParser.IDEN, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public Token atom;
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public Token id;
		public TerminalNode IDEN() { return getToken(GramaticaParser.IDEN, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(110);
				match(T__0);
				setState(111);
				expr(0);
				setState(112);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				((AtomExprContext)_localctx).atom = match(INT);
				}
				break;
			case 3:
				{
				_localctx = new StrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				((StrExprContext)_localctx).str = match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				((IdExprContext)_localctx).id = match(IDEN);
				}
				break;
			case 5:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(IDEN);
				setState(118);
				match(T__0);
				setState(119);
				lexpr();
				setState(120);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(124);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(125);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(126);
						((OpExprContext)_localctx).right = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(128);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						((OpExprContext)_localctx).right = expr(7);
						}
						break;
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002)\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004<\b\u0004"+
		"\u000b\u0004\f\u0004=\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"U\b\u0007\n\u0007\f\u0007X\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f{\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u0083\b\f\n\f\f\f\u0086\t\f\u0001\f\u0000\u0001\u0018"+
		"\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000"+
		"\u0003\u0001\u0000\u0010\u0011\u0001\u0000\f\r\u0001\u0000\u000e\u000f"+
		"\u0087\u0000\u001a\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000"+
		"\u0000\u0004(\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b"+
		";\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000"+
		"\u0000\u000eQ\u0001\u0000\u0000\u0000\u0010Y\u0001\u0000\u0000\u0000\u0012"+
		"_\u0001\u0000\u0000\u0000\u0014e\u0001\u0000\u0000\u0000\u0016k\u0001"+
		"\u0000\u0000\u0000\u0018z\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0002"+
		"\u0001\u0000\u001b\u0001\u0001\u0000\u0000\u0000\u001c \u0003\u0004\u0002"+
		"\u0000\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001d\u0001\u0000\u0000"+
		"\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000#)\u0003\u0012\t\u0000$)\u0003\u0014\n\u0000%)\u0003\u0010"+
		"\b\u0000&)\u0003\u0006\u0003\u0000\')\u0003\f\u0006\u0000(#\u0001\u0000"+
		"\u0000\u0000($\u0001\u0000\u0000\u0000(%\u0001\u0000\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0005\u0001\u0000\u0000"+
		"\u0000*+\u0005\u0013\u0000\u0000+,\u0005\u0018\u0000\u0000,-\u0005\u0001"+
		"\u0000\u0000-.\u0003\u000e\u0007\u0000./\u0005\u0002\u0000\u0000/0\u0005"+
		"\u0003\u0000\u000001\u0005\u0004\u0000\u000012\u0005\u0005\u0000\u0000"+
		"23\u0005\u0003\u0000\u000034\u0003\b\u0004\u000045\u0003\u0002\u0001\u0000"+
		"56\u0005\u0014\u0000\u000067\u0005\u0013\u0000\u000078\u0005\u0018\u0000"+
		"\u000089\u0005\u0003\u0000\u00009\u0007\u0001\u0000\u0000\u0000:<\u0003"+
		"\n\u0005\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000\u0000"+
		"?@\u0003\u0016\u000b\u0000@A\u0005\u0006\u0000\u0000AB\u0005\u0015\u0000"+
		"\u0000BC\u0005\u0001\u0000\u0000CD\u0005\u0016\u0000\u0000DE\u0005\u0002"+
		"\u0000\u0000EF\u0005\u0007\u0000\u0000FG\u0005\u0007\u0000\u0000GH\u0005"+
		"\u0018\u0000\u0000HI\u0005\u0003\u0000\u0000I\u000b\u0001\u0000\u0000"+
		"\u0000JK\u0005\b\u0000\u0000KL\u0005\u0018\u0000\u0000LM\u0005\u0001\u0000"+
		"\u0000MN\u0003\u000e\u0007\u0000NO\u0005\u0002\u0000\u0000OP\u0005\u0003"+
		"\u0000\u0000P\r\u0001\u0000\u0000\u0000QV\u0003\u0018\f\u0000RS\u0005"+
		"\u0006\u0000\u0000SU\u0003\u0018\f\u0000TR\u0001\u0000\u0000\u0000UX\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"W\u000f\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u0012"+
		"\u0000\u0000Z[\u0005\u0001\u0000\u0000[\\\u0003\u0018\f\u0000\\]\u0005"+
		"\u0002\u0000\u0000]^\u0005\u0003\u0000\u0000^\u0011\u0001\u0000\u0000"+
		"\u0000_`\u0005\t\u0000\u0000`a\u0005\u0003\u0000\u0000ab\u0003\u0002\u0001"+
		"\u0000bc\u0005\n\u0000\u0000cd\u0005\u0003\u0000\u0000d\u0013\u0001\u0000"+
		"\u0000\u0000ef\u0003\u0016\u000b\u0000fg\u0005\u0018\u0000\u0000gh\u0005"+
		"\u000b\u0000\u0000hi\u0003\u0018\f\u0000ij\u0005\u0003\u0000\u0000j\u0015"+
		"\u0001\u0000\u0000\u0000kl\u0007\u0000\u0000\u0000l\u0017\u0001\u0000"+
		"\u0000\u0000mn\u0006\f\uffff\uffff\u0000no\u0005\u0001\u0000\u0000op\u0003"+
		"\u0018\f\u0000pq\u0005\u0002\u0000\u0000q{\u0001\u0000\u0000\u0000r{\u0005"+
		"\u0017\u0000\u0000s{\u0005\u0019\u0000\u0000t{\u0005\u0018\u0000\u0000"+
		"uv\u0005\u0018\u0000\u0000vw\u0005\u0001\u0000\u0000wx\u0003\u000e\u0007"+
		"\u0000xy\u0005\u0002\u0000\u0000y{\u0001\u0000\u0000\u0000zm\u0001\u0000"+
		"\u0000\u0000zr\u0001\u0000\u0000\u0000zs\u0001\u0000\u0000\u0000zt\u0001"+
		"\u0000\u0000\u0000zu\u0001\u0000\u0000\u0000{\u0084\u0001\u0000\u0000"+
		"\u0000|}\n\u0007\u0000\u0000}~\u0007\u0001\u0000\u0000~\u0083\u0003\u0018"+
		"\f\b\u007f\u0080\n\u0006\u0000\u0000\u0080\u0081\u0007\u0002\u0000\u0000"+
		"\u0081\u0083\u0003\u0018\f\u0007\u0082|\u0001\u0000\u0000\u0000\u0082"+
		"\u007f\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0019\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0007"+
		" (=Vz\u0082\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}