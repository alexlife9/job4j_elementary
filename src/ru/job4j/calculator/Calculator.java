package ru.job4j.calculator;

public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
    }
}

/*    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int four = 4;
        int five = 5;
        int six = 6;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}*/

/*
public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int result = one + two;
        System.out.println(result);
        one = 10;
        two = 11;
        result = one + two;
        System.out.println(result);
    }
}*/
