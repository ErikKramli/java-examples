package com.erikkramli.app;

import com.erikkramli.app.demo.Demo;
import com.erikkramli.app.interpreter.InterpreterDemo;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello");

        Demo interpreterDemo = new InterpreterDemo();
        interpreterDemo.demo();
    }
}
