// Generated from Formula.g4 by ANTLR 4.7

package com.github.tacigar.qalculator.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FormulaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FormulaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link FormulaParser#plusMinusExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(FormulaParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToTimesDiv}
	 * labeled alternative in {@link FormulaParser#plusMinusExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToTimesDiv(FormulaParser.ToTimesDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link FormulaParser#plusMinusExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(FormulaParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link FormulaParser#timesDivExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(FormulaParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Times}
	 * labeled alternative in {@link FormulaParser#timesDivExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimes(FormulaParser.TimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToValue}
	 * labeled alternative in {@link FormulaParser#timesDivExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToValue(FormulaParser.ToValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link FormulaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(FormulaParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link FormulaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(FormulaParser.ParenContext ctx);
}