<<<<<<< HEAD
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
=======
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
>>>>>>> a855bd3207a025fa9c51b0792f51fb44e64e40ed
