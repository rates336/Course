package com.kodilla.testing.shape2;

public class Circle {
    String name;
    double radius;
    double PI = 3.14;

    public Circle(String name) {
        this.name = name;
    }

    public String getShapeName() {
        return name;
    }

    public double getField(double date1) {
        radius = date1;
        return radius * radius * PI;
    }
}
