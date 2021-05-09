package ru.job4j.condition;

public class LogicAnd {
    public static boolean check(int num) {
        return (num % 2 == 0 && num > 0) ? true : false;
    }
}