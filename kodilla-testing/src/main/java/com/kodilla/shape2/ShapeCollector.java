package com.kodilla.shape2;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> listOfShapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        listOfShapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        listOfShapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return listOfShapes.get(n);
    }

    public int getListSize() {
        return listOfShapes.size();
    }

}
