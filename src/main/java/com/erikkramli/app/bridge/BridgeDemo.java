package com.erikkramli.app.bridge;

import com.erikkramli.app.demo.Demo;

import java.util.ArrayList;
import java.util.Collection;

public class BridgeDemo implements Demo {

    @Override
    public void demo() {
        Collection<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(new Blue()));
        shapes.add(new Circle(new Red()));
        shapes.add(new Triangle(new Red()));

        for (Shape s : shapes) {
            s.draw();
        }
    }
}
