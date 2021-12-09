package com.kodilla.testing.shape2;

public class Circle implements Shape {
    String name;
    double radius;
    double PI = 3.14;

    public Circle(String name) {
        this.name = name;
    }

    public String getShapeName() {
        return name;
    }

    public double getField(double radius, double date2) {
        return radius * radius * PI;
    }
}
