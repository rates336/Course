package com.kodilla.shape2;

public class Square implements Shape {
    String name;
    double lengthSide;

    public Square(String name) {
        this.name = name;
    }

    public String getShapeName() {
        return name;
    }

    public double getField(double lengthSide, double date2) {
        return lengthSide * lengthSide;
    }
}
