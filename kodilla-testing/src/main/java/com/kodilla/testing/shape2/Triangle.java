package com.kodilla.testing.shape2;

public class Triangle implements Shape{
    String name;
    double height;
    double lengthSide;

    public Triangle(String name) {
        this.name = name;
    }

    public String getShapeName() {
        return name;
    }

    public double getField(double date1, double date2) {
        height = date1;
        lengthSide = date2;
        return height * lengthSide / 2;
    }

}
