package com.erikkramli.app.interpreter;

public class AndExpression implements Expression {

    private final Expression leftOperand;
    private final Expression rightOperand;

    public AndExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public boolean interpret(String text) {
        return leftOperand.interpret(text) && rightOperand.interpret(text);
    }
}
