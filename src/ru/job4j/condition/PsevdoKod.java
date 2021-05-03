package ru.job4j.condition;

public class PsevdoKod {
    public static void main(String[] args) {
        int a = 10000;
        int b = 1020;
        int c = 1070;

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}