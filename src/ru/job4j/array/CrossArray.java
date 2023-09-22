package ru.job4j.array;

public class CrossArray {

    public static void printCrossEl(int[] left, int[] right) {
        int rsl = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    rsl += left[i];
                    System.out.println(rsl);
                }
            }
        }
    }
}