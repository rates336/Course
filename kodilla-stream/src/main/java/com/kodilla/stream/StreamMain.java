package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemBeautifierRef;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        //expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        //expressionExecutor.executeExpression(10, 5, FunctionalCalculator::subBFromA);
        PoemBeautifier pb = new PoemBeautifier();
        pb.beautify("Pizza", text -> "Good  " + text + " !!!" );
        pb.beautify("Burger", text -> "VGood " + text + " ..." );
        pb.beautify("Kebab", text -> "Not Bad " + text + " ???" );
        pb.beautify("Sushi", text -> "It's OK " + text + " > <" );
        pb.beautify("Fries", text -> text.toLowerCase(Locale.ROOT) );
        pb.beautify("L o L", text -> text.length() + " " + text);

        expressionExecutor.executeBeautify("Pizza", PoemBeautifierRef::bStyle1);
        expressionExecutor.executeBeautify("Pizza", PoemBeautifierRef::bStyle2);
        expressionExecutor.executeBeautify("Pizza", PoemBeautifierRef::bStyle3);
        expressionExecutor.executeBeautify("Pizza", PoemBeautifierRef::bStyle4);

    }
}
