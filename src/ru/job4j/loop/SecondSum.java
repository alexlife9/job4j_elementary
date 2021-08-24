package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i += 2) {
            sum = sum + i;
        }
        return sum;
    }
}

//Даны два целых положительных числа a и b (b > a).
//Надо сложить каждое второе число в диапазоне [a, b] начиная с первого