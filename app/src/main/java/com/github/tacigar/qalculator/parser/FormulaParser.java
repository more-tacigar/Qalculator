// Generated from Formula.g4 by ANTLR 4.7

package com.github.tacigar.qalculator.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, PLUS=3, MINUS=4, TIMES=5, DIV=6, DOT=7, DIGIT=8;
	public static final int
		RULE_plusMinusExp = 0, RULE_timesDivExp = 1, RULE_value = 2;
	public static final String[] ruleNames = {
		"plusMinusExp", "timesDivExp", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'+'", "'-'", "'\u00D7'", "'/'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "DOT", "DIGIT"
	};
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
	public String getGrammarFileName() { return "Formula.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FormulaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PlusMinusExpContext extends ParserRuleContext {
		public PlusMinusExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusMinusExp; }
	 
		public PlusMinusExpContext() { }
		public void copyFrom(PlusMinusExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PlusContext extends PlusMinusExpContext {
		public PlusMinusExpContext plusMinusExp() {
			return getRuleContext(PlusMinusExpContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FormulaParser.PLUS, 0); }
		public TimesDivExpContext timesDivExp() {
			return getRuleContext(TimesDivExpContext.class,0);
		}
		public PlusContext(PlusMinusExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToTimesDivContext extends PlusMinusExpContext {
		public TimesDivExpContext timesDivExp() {
			return getRuleContext(TimesDivExpContext.class,0);
		}
		public ToTimesDivContext(PlusMinusExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitToTimesDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends PlusMinusExpContext {
		public PlusMinusExpContext plusMinusExp() {
			return getRuleContext(PlusMinusExpContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FormulaParser.MINUS, 0); }
		public TimesDivExpContext timesDivExp() {
			return getRuleContext(TimesDivExpContext.class,0);
		}
		public MinusContext(PlusMinusExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusMinusExpContext plusMinusExp() throws RecognitionException {
		return plusMinusExp(0);
	}

	private PlusMinusExpContext plusMinusExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PlusMinusExpContext _localctx = new PlusMinusExpContext(_ctx, _parentState);
		PlusMinusExpContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_plusMinusExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToTimesDivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(7);
			timesDivExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(17);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(15);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new PlusMinusExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusMinusExp);
						setState(9);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(10);
						match(PLUS);
						setState(11);
						timesDivExp(0);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new PlusMinusExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusMinusExp);
						setState(12);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(13);
						match(MINUS);
						setState(14);
						timesDivExp(0);
						}
						break;
					}
					} 
				}
				setState(19);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class TimesDivExpContext extends ParserRuleContext {
		public TimesDivExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timesDivExp; }
	 
		public TimesDivExpContext() { }
		public void copyFrom(TimesDivExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends TimesDivExpContext {
		public TimesDivExpContext timesDivExp() {
			return getRuleContext(TimesDivExpContext.class,0);
		}
		public TerminalNode DIV() { return getToken(FormulaParser.DIV, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DivContext(TimesDivExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimesContext extends TimesDivExpContext {
		public TimesDivExpContext timesDivExp() {
			return getRuleContext(TimesDivExpContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(FormulaParser.TIMES, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TimesContext(TimesDivExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitTimes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToValueContext extends TimesDivExpContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ToValueContext(TimesDivExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitToValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimesDivExpContext timesDivExp() throws RecognitionException {
		return timesDivExp(0);
	}

	private TimesDivExpContext timesDivExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TimesDivExpContext _localctx = new TimesDivExpContext(_ctx, _parentState);
		TimesDivExpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_timesDivExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToValueContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(21);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(29);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new TimesContext(new TimesDivExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_timesDivExp);
						setState(23);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(24);
						match(TIMES);
						setState(25);
						value();
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new TimesDivExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_timesDivExp);
						setState(26);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(27);
						match(DIV);
						setState(28);
						value();
						}
						break;
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberContext extends ValueContext {
		public TerminalNode MINUS() { return getToken(FormulaParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(FormulaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(FormulaParser.DIGIT, i);
		}
		public TerminalNode DOT() { return getToken(FormulaParser.DOT, 0); }
		public NumberContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends ValueContext {
		public TerminalNode LPAREN() { return getToken(FormulaParser.LPAREN, 0); }
		public PlusMinusExpContext plusMinusExp() {
			return getRuleContext(PlusMinusExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FormulaParser.RPAREN, 0); }
		public ParenContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		int _la;
		try {
			int _alt;
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case DIGIT:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(34);
					match(MINUS);
					}
				}

				setState(38); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(37);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(40); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(42);
					match(DOT);
					setState(44); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(43);
							match(DIGIT);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(46); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				break;
			case LPAREN:
				_localctx = new ParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(LPAREN);
				setState(51);
				plusMinusExp(0);
				setState(52);
				match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return plusMinusExp_sempred((PlusMinusExpContext)_localctx, predIndex);
		case 1:
			return timesDivExp_sempred((TimesDivExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean plusMinusExp_sempred(PlusMinusExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean timesDivExp_sempred(TimesDivExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\4"+
		"\5\4&\n\4\3\4\6\4)\n\4\r\4\16\4*\3\4\3\4\6\4/\n\4\r\4\16\4\60\5\4\63\n"+
		"\4\3\4\3\4\3\4\3\4\5\49\n\4\3\4\2\4\2\4\5\2\4\6\2\2\2@\2\b\3\2\2\2\4\26"+
		"\3\2\2\2\68\3\2\2\2\b\t\b\2\1\2\t\n\5\4\3\2\n\23\3\2\2\2\13\f\f\5\2\2"+
		"\f\r\7\5\2\2\r\22\5\4\3\2\16\17\f\4\2\2\17\20\7\6\2\2\20\22\5\4\3\2\21"+
		"\13\3\2\2\2\21\16\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24"+
		"\3\3\2\2\2\25\23\3\2\2\2\26\27\b\3\1\2\27\30\5\6\4\2\30!\3\2\2\2\31\32"+
		"\f\5\2\2\32\33\7\7\2\2\33 \5\6\4\2\34\35\f\4\2\2\35\36\7\b\2\2\36 \5\6"+
		"\4\2\37\31\3\2\2\2\37\34\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\5"+
		"\3\2\2\2#!\3\2\2\2$&\7\6\2\2%$\3\2\2\2%&\3\2\2\2&(\3\2\2\2\')\7\n\2\2"+
		"(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\62\3\2\2\2,.\7\t\2\2-/\7\n"+
		"\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62"+
		",\3\2\2\2\62\63\3\2\2\2\639\3\2\2\2\64\65\7\3\2\2\65\66\5\2\2\2\66\67"+
		"\7\4\2\2\679\3\2\2\28%\3\2\2\28\64\3\2\2\29\7\3\2\2\2\13\21\23\37!%*\60"+
		"\628";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}