package ru.job4j.condition;

public class LogicOr {

    public static boolean check(int num) {
        return num < 0 || num % 2 != 0;
    }
}


//нужно проверить, что переданное число отрицательно ИЛИ нечетно