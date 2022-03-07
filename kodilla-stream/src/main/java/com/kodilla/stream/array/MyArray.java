package com.kodilla.stream.array;

import java.util.stream.IntStream;



public class MyArray implements ArrayOperations {
    public double getAverage(int[] numbers){
        IntStream.range(0, numbers.length)
                .map(e -> numbers[e])
                .forEach(System.out::println);
        double tabAverage = IntStream.range(0, numbers.length)
                    .map(e -> numbers[e])
                    .average()
                    .getAsDouble();
        System.out.println(tabAverage);
        return tabAverage;
    }
}
