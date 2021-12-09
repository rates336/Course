package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    OddNumbersExterminator odd = new OddNumbersExterminator();

    @BeforeEach
    public void before() {
        System.out.println("Before " );
    }
    @AfterEach
    public void after() {
        System.out.println("After ");
    }

    @DisplayName
        ("Test if the list is empty " +
            "is empty")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        List <Integer> empty = new ArrayList<Integer>();
        List <Integer> result = odd.exterminate(empty);
        Assertions.assertEquals(empty, result);
    }
    @DisplayName("Test if the list " +
            "has odd and even numbers"
    )
    @Test
    public void testOddNumbersExterminatorNormalList() {
        List <Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            numbers.add(i);
        }
        List <Integer> theList = numbers;
        Assertions.assertEquals(theList, numbers);
    }

    @DisplayName("Test if the list " +
            "had only even numbers.")
    @Test
    public void testOddNumbersExterminatorEvenList() {
        List<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(0);
        evenNumbers.add(2);
        evenNumbers.add(4);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            numbers.add(i);
        }
        List<Integer> theList = odd.exterminate(numbers);
        Assertions.assertEquals(theList, evenNumbers);

    }


}
