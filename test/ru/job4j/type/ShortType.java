package ru.job4j.type;

import java.util.Scanner;

public class ShortType {
    public static void main(short[] args) {
        Scanner sh = new Scanner(System.in);
        short value = sh.nextShort();
        System.out.println(value);
    }
}