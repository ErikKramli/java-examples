package com.erikkramli.app.bridge;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Triangle drawn with " + color.getColor());
    }
}


