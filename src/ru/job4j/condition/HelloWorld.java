package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                rsl = "Hello, World!!!";
            } else {
                rsl = "Hello";
            }
        } else {
            if (number % 5 == 0) {
                rsl = "World";
            } else {
                rsl = "Operation not support";
            }
        }
        return rsl;
    }
}