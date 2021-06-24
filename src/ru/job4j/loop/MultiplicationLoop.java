package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int rsl = 0;
        for (int i = a; i <= b; i++) {
            System.out.println(i * i);
        }
        return rsl;
    }
}