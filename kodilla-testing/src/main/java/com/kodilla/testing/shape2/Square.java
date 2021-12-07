package com.kodilla.testing.shape2;

public class Square {
    String name;
    double lengthSide;

    public Square(String name) {
        this.name = name;
    }

    public String getShapeName() {
        return name;
    }

    public double getField(double date1) {
        lengthSide = date1;
        return lengthSide * lengthSide;
    }
}
