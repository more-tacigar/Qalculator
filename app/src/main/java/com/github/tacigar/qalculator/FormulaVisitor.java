package com.github.tacigar.qalculator;

import android.util.Log;

import com.github.tacigar.qalculator.parser.FormulaBaseVisitor;
import com.github.tacigar.qalculator.parser.FormulaParser;

public class FormulaVisitor extends FormulaBaseVisitor<Double> {
    @Override
    public Double visitPlus(FormulaParser.PlusContext ctx) {
        return visit(ctx.plusMinusExp()) + visit(ctx.timesDivExp());
    }

    @Override
    public Double visitMinus(FormulaParser.MinusContext ctx) {
        return visit(ctx.plusMinusExp()) - visit(ctx.timesDivExp());
    }

    @Override
    public Double visitTimes(FormulaParser.TimesContext ctx) {
        return visit(ctx.timesDivExp()) * visit(ctx.value());
    }

    @Override
    public Double visitDiv(FormulaParser.DivContext ctx) {
        return visit(ctx.timesDivExp()) * visit(ctx.value());
    }

    @Override
    public Double visitNumber(FormulaParser.NumberContext ctx) {
        return Double.parseDouble(ctx.getText());
    }

    @Override
    public Double visitParen(FormulaParser.ParenContext ctx) {
        return visit(ctx.plusMinusExp());
    }
}
