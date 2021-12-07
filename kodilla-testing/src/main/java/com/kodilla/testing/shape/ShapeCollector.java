package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Triangle implements Shape {
    Random ran = new Random();
    int triangleNumber = ran.nextInt(100);
    public String getName(String name) {
        return name;
    }

    public int getField(int field) {
        return field;
    }

}

class Square implements Shape {
    Random ran = new Random();
    int squareNumber = ran.nextInt(100);
    public String getName(String name) {
        return name;
    }

    public int getField(int field) {
        return field;
    }

}

class Circle implements Shape {
    Random ran = new Random();
    int circleNumber = ran.nextInt(100);
    public String getName(String name) {
        return name;
    }

    public int getField(int field) {
        return field;
    }

}

interface Shape {

    public String getName(String name);

    public int getField(int field);
}

class ShapeCollector2 {
    List<Triangle> listOfTriangles = new ArrayList<Triangle>();
    List<Square> listOfSquares = new ArrayList<Square>();
    List<Circle> listOfCircles = new ArrayList<Circle>();
    Triangle theTriangle = new Triangle();
    Square theSquare = new Square();
    Circle theCircle = new Circle();


    public void addShape(String name) {
        boolean result = false;
        if(name.equals("triangle") || name.equals("Triangle")) {
            listOfTriangles.add(theTriangle);
            System.out.println("added " + name);
            result = true;
        }
        if(name.equals("square") || name.equals("Square")) {
            listOfSquares.add(theSquare);
            System.out.println("added " + name);
            result = true;
        }
        if(name.equals("circle") || name.equals("Circle")) {
            listOfCircles.add(theCircle);
            System.out.println("added " + name);
            result = true;
        }
        System.out.println(result);
    }
    public void removeShape(String name) {
        boolean result = false;
        if(name.equals("triangle") || name.equals("Triangle")) {
            listOfTriangles.remove(theTriangle);
            System.out.println("deleted " + name);
            result = true;
        }
        if(name.equals("square") || name.equals("Square")) {
            listOfSquares.remove(theSquare);
            System.out.println("deleted " + name);
            result = true;
        }
        if(name.equals("circle") || name.equals("Circle")) {
            listOfCircles.remove(theCircle);
            System.out.println("deleted " + name);
            result = true;
        }
        System.out.println(result);
    }
    public void showShape(String name) {
        if(name.equals("triangle") || name.equals("Triangle")) {
            Triangle tempTriangle = listOfTriangles.get(listOfTriangles.size()-1);
            System.out.println("triangle " + tempTriangle.triangleNumber);
        }
        if(name.equals("square") || name.equals("Square")) {
            Square tempSquare = listOfSquares.get(listOfSquares.size()-1);
            System.out.println("square " + tempSquare.squareNumber);
        }
        if(name.equals("circle") || name.equals("Circle")) {
            Circle tempCircle = listOfCircles.get(listOfCircles.size()-1);
            System.out.println("circle " + tempCircle.circleNumber);
        }

    }
    public String allShapeInOne() {
        String allInOne = "";
        String name1 = "Triangle";
        String name2 = "Square";
        String name3 = "Circle";
        for (int i = 0; i < listOfCircles.size(); i++) {
            allInOne = allInOne + listOfCircles.get(i).getName(name3);
        }
        for (int i = 0; i < listOfSquares.size(); i++) {
            allInOne = allInOne + listOfSquares.get(i).getName(name2);
        }
        for (int i = 0; i < listOfTriangles.size(); i++) {
            allInOne = allInOne + listOfTriangles.get(i).getName(name1);
        }
        return allInOne;
    }
    }


public class ShapeCollector {
    public static void main(String[] args) {
        ShapeCollector2 sh = new ShapeCollector2();
        sh.addShape("circle");
        sh.addShape("circle");
        sh.addShape("square");
        sh.addShape("Triangle");
        sh.addShape("square");
        sh.addShape("circle");
        sh.addShape("circle");
        sh.removeShape("square");
        sh.showShape("Circle");
        System.out.println(sh.allShapeInOne());


    }

}
