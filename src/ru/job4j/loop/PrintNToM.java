package ru.job4j.loop;

public class PrintNToM {
    public static void out(int n, int m) {
        int out = 0;
        for (int i = n; i < m; i++) {
            System.out.println(i);
        }
        return;
    }
}