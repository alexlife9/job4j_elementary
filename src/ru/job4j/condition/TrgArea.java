package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        return Math.sqrt((a + b + c ) / 2 * ((a + b + c ) / 2 - a) * ((a + b + c ) / 2 - b) * ((a + b + c ) / 2 - c));
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 2;
        double rsl = TrgArea.area(a, b, c);
        System.out.println("длины сторон треугольника (" + a + ", " + b + ", " + c + "). Площадь = " + rsl);
    }
}
