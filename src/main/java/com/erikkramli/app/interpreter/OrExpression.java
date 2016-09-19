package com.erikkramli.app.interpreter;

public class OrExpression implements Expression {

    private final Expression leftOperand;
    private final Expression rightOperand;

    public OrExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public boolean interpret(String text) {
        return leftOperand.interpret(text) || rightOperand.interpret(text);
    }
}
