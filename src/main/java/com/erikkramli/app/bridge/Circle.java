package com.erikkramli.app.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Circle drawn with " + color.getColor());
    }
}

