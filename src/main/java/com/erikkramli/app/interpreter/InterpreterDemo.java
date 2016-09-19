package com.erikkramli.app.interpreter;

import com.erikkramli.app.demo.Demo;

public class InterpreterDemo implements Demo {

    @Override
    public void demo() {
        Expression isMale = getMaleRule();
        Expression isMarriedWoman = getMarriedWomanRule();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }

    public Expression getMaleRule(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public Expression getMarriedWomanRule(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
