package com.kodilla.testing.shape;

import com.kodilla.testing.shape2.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    ShapeCollector sc = new ShapeCollector();

@BeforeEach
    public void BE() {
    System.out.println("Now opening new test");
}



@Test
public void testAddFigure() {
    Shape shape = new Triangle("triangle");
    Shape shape2 = new Circle("circle");
    Shape shape3 = new Square("square");
    List<Shape> expList = new ArrayList<>();
    sc.addFigure(shape);
    sc.addFigure(shape2);
    sc.addFigure(shape3);
    expList.add(shape);
    expList.add(shape2);
    expList.add(shape3);
    Assertions.assertEquals(expList.get(0), sc.getFigure(0));
    Assertions.assertEquals(expList.get(1), sc.getFigure(1));
    Assertions.assertEquals(expList.get(2), sc.getFigure(2));

}

@Test
public void testListSize() {
    List<Shape> shapes = new ArrayList<>();
    Shape shape = new Triangle("triangle");
    shapes.add(shape);
    sc.addFigure(shape);
    Assertions.assertEquals(shapes.size(), sc.getListSize());
}

@Test
public void testRemoveFigure() {
    Shape shape = new Triangle("triangle");
    Shape shape2 = new Circle("circle");
    Shape shape3 = new Square("square");
    List<Shape> theList = new ArrayList<>();
    sc.addFigure(shape);
    sc.addFigure(shape2);
    sc.addFigure(shape3);
    theList.add(shape);
    theList.add(shape2);
    theList.add(shape3);
    sc.removeFigure(shape);
    theList.remove(shape);
    Assertions.assertEquals(theList.get(0), sc.getFigure(0));
    sc.removeFigure(shape2);
    theList.remove(shape2);
    Assertions.assertEquals(theList.get(0), sc.getFigure(0));
    sc.removeFigure(shape3);
    theList.remove(shape3);
    Assertions.assertEquals(theList.size(), sc.getListSize());
}

@Test
public void testGetFigure() {
        int n = 0;
        List<Shape> shapes = new ArrayList<>();
        Shape shape = new Circle("circle");
        shapes.add(shape);
        sc.addFigure(shape);
        Assertions.assertEquals(shapes.get(n), sc.getFigure(n));
    }


}
