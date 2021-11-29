package com.kodilla.testing.calc;

public class Calc {
    public static void main(String[] args) {
        Calc c = new Calc();
        int test1 = c.add(5, 5);
        int test2 = c.subtract(10, 5);
        if(test1 == 5 + 5)
            System.out.println("It's Ok /c.add");
        else
            System.out.println("It's not Ok /c.add");

        if(test2 == 10 - 5)
            System.out.println("It's Ok /c.subtract");
        else
            System.out.println("It's mot Ok /c.subtract");
    }

        public int add(int a, int b) {
            return a + b;
        }
        public int subtract(int a, int b) {
            return a - b;
        }

}
