package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {


    public int[] tabGenerator(int number) {
        int[] tab = new int[number];
        for (int i = 0; i < number; i++) {
            tab[i] = 2 * i + 10;
        }
        return tab;
    }

    @Test
    void testGetAverage() {
        //Given
        MyArray myArray = new MyArray();

        //When
        double actualAverage = myArray.getAverage(tabGenerator(20));

        //Then
        assertEquals(29.0, actualAverage);
    }
}