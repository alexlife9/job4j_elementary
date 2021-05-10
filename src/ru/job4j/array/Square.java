package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rsl = new int[bound];
        for (int index = 0; index < rsl.length; index++) {
            rsl[index] = (int) Math.pow(index, 2);
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] array = calculate(5);
        for (int i : array) {
            System.out.println(i);
        }
    }
}

