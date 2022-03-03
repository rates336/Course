package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ArrayOperationsTestSuite {
    @Mock
    MyArray myArrayMock;

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
        int[] tab = tabGenerator(20);
        when(myArrayMock.getAverage(tab)).thenReturn(29.0);

        //When

        double actualAverage = myArray.getAverage(tabGenerator(20));

        //Then
        assertEquals(29.0, actualAverage);
    }
}
