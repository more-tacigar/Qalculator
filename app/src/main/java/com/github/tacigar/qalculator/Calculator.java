package com.github.tacigar.qalculator;

import android.widget.TextView;

import com.github.tacigar.qalculator.parser.FormulaLexer;
import com.github.tacigar.qalculator.parser.FormulaParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Calculator {
    private StringBuffer formula;
    private TextView text;

    public Calculator(TextView text) {
        this.formula = new StringBuffer();
        this.text = text;
    }

    private void updateFormula() {
        text.setText(formula.toString());
    }

    public void put(char c) {
        formula.append(c);
        updateFormula();
    }

    public void clear() {
        formula = new StringBuffer();
        updateFormula();
    }

    private boolean isDouble(Double d) {
        return Math.ceil(d) != Math.floor(d);
    }

    public void calculate() {
        CharStream in = CharStreams.fromString(formula.toString());
        FormulaLexer lexer = new FormulaLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FormulaParser parser = new FormulaParser(tokens);
        ParseTree tree = parser.plusMinusExp();

        FormulaVisitor visitor = new FormulaVisitor();
        Double result = visitor.visit(tree);

        formula = new StringBuffer();

        if (isDouble(result)) {
            formula.append(result);
        } else {
            formula.append(result.intValue());
        }
        updateFormula();
    }

}
