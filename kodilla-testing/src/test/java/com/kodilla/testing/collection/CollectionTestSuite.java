package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    OddNumbersExterminator odd = new OddNumbersExterminator();
    CollectionTestSuite cts = new CollectionTestSuite();
    List<Integer> kubaTest = new ArrayList<>();

    @BeforeEach
    public void before() {
        System.out.println("Before " );
    }
    @AfterEach
    public void after() {
        System.out.println("After ");
    }

    @DisplayName("Test if the list is empty, " +
            "has odd and even numbers"
    )
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        Assertions.assertEquals(odd.exterminate(odd.listCreator()), kubaTest);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        for (int i = 0; i < 6; i++) {
            cts.kubaTest.add(i);
        }
        Assertions.assertEquals(odd.exterminate(kubaTest), cts.kubaTest);
    }


}
/*
Jak mam zapisać w adnotacjach nazwe testu, który się aktualnie wykonuje?
Mam się jakoś odwołać do nazwy metody?
Bo nie było tego w kodilli, a nie za bardzo mam pomysł
PS. Ten 6 pkt w zadaniu
*/
