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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, INT=19, IDEN=20, STRING=21, WS=22;
	public static final int
		RULE_start = 0, RULE_linstrucciones = 1, RULE_instrucciones = 2, RULE_implicit = 3, 
		RULE_subroutine = 4, RULE_lexpr = 5, RULE_print = 6, RULE_block = 7, RULE_declaration = 8, 
		RULE_type = 9, RULE_expr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "linstrucciones", "instrucciones", "implicit", "subroutine", 
			"lexpr", "print", "block", "declaration", "type", "expr"
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
			setState(22);
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
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public LinstruccionesContext linstrucciones() {
			return getRuleContext(LinstruccionesContext.class,0);
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
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				instrucciones();
				setState(25);
				linstrucciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				instrucciones();
				}
				break;
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
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	 
		public InstruccionesContext() { }
		public void copyFrom(InstruccionesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrContext extends InstruccionesContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrContext(InstruccionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclContext extends InstruccionesContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclContext(InstruccionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubrContext extends InstruccionesContext {
		public SubroutineContext subroutine() {
			return getRuleContext(SubroutineContext.class,0);
		}
		public SubrContext(InstruccionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSubr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlckContext extends InstruccionesContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlckContext(InstruccionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBlck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucciones);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new BlckContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				block();
				}
				break;
			case T__12:
			case T__13:
				_localctx = new DeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				declaration();
				}
				break;
			case T__7:
				_localctx = new PrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				print();
				}
				break;
			case T__2:
				_localctx = new SubrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				subroutine();
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

	public static class ImplicitContext extends ParserRuleContext {
		public ImplicitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitImplicit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicitContext implicit() throws RecognitionException {
		ImplicitContext _localctx = new ImplicitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_implicit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(T__1);
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
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public ImplicitContext implicit() {
			return getRuleContext(ImplicitContext.class,0);
		}
		public LinstruccionesContext linstrucciones() {
			return getRuleContext(LinstruccionesContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_subroutine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__2);
			setState(40);
			((SubroutineContext)_localctx).id1 = match(IDEN);
			setState(41);
			match(T__3);
			setState(42);
			lexpr();
			setState(43);
			match(T__4);
			setState(44);
			implicit();
			setState(45);
			linstrucciones();
			setState(46);
			match(T__5);
			setState(47);
			match(T__2);
			setState(48);
			((SubroutineContext)_localctx).id2 = match(IDEN);
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
		enterRule(_localctx, 10, RULE_lexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			expr(0);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(51);
				match(T__6);
				setState(52);
				expr(0);
				}
				}
				setState(57);
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
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__7);
			setState(59);
			match(T__3);
			setState(60);
			expr(0);
			setState(61);
			match(T__4);
			setState(62);
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
		enterRule(_localctx, 14, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__9);
			setState(65);
			linstrucciones();
			setState(66);
			match(T__10);
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
		enterRule(_localctx, 16, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			type();
			setState(69);
			match(IDEN);
			setState(70);
			match(T__11);
			setState(71);
			expr(0);
			setState(72);
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

	public static class TypeContext extends ParserRuleContext {
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
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				match(T__3);
				setState(78);
				expr(0);
				setState(79);
				match(T__4);
				}
				break;
			case INT:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				((AtomExprContext)_localctx).atom = match(INT);
				}
				break;
			case STRING:
				{
				_localctx = new StrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				((StrExprContext)_localctx).str = match(STRING);
				}
				break;
			case IDEN:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				((IdExprContext)_localctx).id = match(IDEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(87);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						((OpExprContext)_localctx).right = expr(7);
						}
						break;
					case 2:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(90);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						((OpExprContext)_localctx).right = expr(6);
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001d\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002#\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u00056\b"+
		"\u0005\n\u0005\f\u00059\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\nU\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n]\b\n\n"+
		"\n\f\n`\t\n\u0001\n\u0000\u0001\u0014\u000b\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0000\u0003\u0001\u0000\r\u000e\u0001\u0000"+
		"\u000f\u0010\u0001\u0000\u0011\u0012`\u0000\u0016\u0001\u0000\u0000\u0000"+
		"\u0002\u001c\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006"+
		"$\u0001\u0000\u0000\u0000\b\'\u0001\u0000\u0000\u0000\n2\u0001\u0000\u0000"+
		"\u0000\f:\u0001\u0000\u0000\u0000\u000e@\u0001\u0000\u0000\u0000\u0010"+
		"D\u0001\u0000\u0000\u0000\u0012J\u0001\u0000\u0000\u0000\u0014T\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0001\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0003\u0004\u0002\u0000\u0019\u001a\u0003"+
		"\u0002\u0001\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u001d\u0003"+
		"\u0004\u0002\u0000\u001c\u0018\u0001\u0000\u0000\u0000\u001c\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e#\u0003\u000e"+
		"\u0007\u0000\u001f#\u0003\u0010\b\u0000 #\u0003\f\u0006\u0000!#\u0003"+
		"\b\u0004\u0000\"\u001e\u0001\u0000\u0000\u0000\"\u001f\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#\u0005\u0001"+
		"\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0005\u0002\u0000\u0000"+
		"&\u0007\u0001\u0000\u0000\u0000\'(\u0005\u0003\u0000\u0000()\u0005\u0014"+
		"\u0000\u0000)*\u0005\u0004\u0000\u0000*+\u0003\n\u0005\u0000+,\u0005\u0005"+
		"\u0000\u0000,-\u0003\u0006\u0003\u0000-.\u0003\u0002\u0001\u0000./\u0005"+
		"\u0006\u0000\u0000/0\u0005\u0003\u0000\u000001\u0005\u0014\u0000\u0000"+
		"1\t\u0001\u0000\u0000\u000027\u0003\u0014\n\u000034\u0005\u0007\u0000"+
		"\u000046\u0003\u0014\n\u000053\u0001\u0000\u0000\u000069\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u000b\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\b\u0000\u0000;<\u0005"+
		"\u0004\u0000\u0000<=\u0003\u0014\n\u0000=>\u0005\u0005\u0000\u0000>?\u0005"+
		"\t\u0000\u0000?\r\u0001\u0000\u0000\u0000@A\u0005\n\u0000\u0000AB\u0003"+
		"\u0002\u0001\u0000BC\u0005\u000b\u0000\u0000C\u000f\u0001\u0000\u0000"+
		"\u0000DE\u0003\u0012\t\u0000EF\u0005\u0014\u0000\u0000FG\u0005\f\u0000"+
		"\u0000GH\u0003\u0014\n\u0000HI\u0005\t\u0000\u0000I\u0011\u0001\u0000"+
		"\u0000\u0000JK\u0007\u0000\u0000\u0000K\u0013\u0001\u0000\u0000\u0000"+
		"LM\u0006\n\uffff\uffff\u0000MN\u0005\u0004\u0000\u0000NO\u0003\u0014\n"+
		"\u0000OP\u0005\u0005\u0000\u0000PU\u0001\u0000\u0000\u0000QU\u0005\u0013"+
		"\u0000\u0000RU\u0005\u0015\u0000\u0000SU\u0005\u0014\u0000\u0000TL\u0001"+
		"\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TS\u0001\u0000\u0000\u0000U^\u0001\u0000\u0000\u0000VW\n\u0006\u0000\u0000"+
		"WX\u0007\u0001\u0000\u0000X]\u0003\u0014\n\u0007YZ\n\u0005\u0000\u0000"+
		"Z[\u0007\u0002\u0000\u0000[]\u0003\u0014\n\u0006\\V\u0001\u0000\u0000"+
		"\u0000\\Y\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0015\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000\u0006\u001c\"7T\\^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}