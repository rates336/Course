package com.kodilla.stream.lambda;

import com.kodilla.stream.beautifier.PoemDecorator;

public class ExpressionExecutor {

    public void executeExpression(double a, double b,
            MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("Result equals: " + result);
    }

    public void executeBeautify(String text,
                         PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }
}
