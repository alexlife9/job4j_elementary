package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        int p = 9;
        int k = 3;
        double result1 = SqArea.square(p, k);
        System.out.println(" p = " + p + ", k = " + k + ", площадь = " + result1);
    }
}