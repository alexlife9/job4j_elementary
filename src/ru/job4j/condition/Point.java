package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = (x2 - x1);
        double b = (y2 - y1);
        double c = Math.pow(a, 2);
        double d = Math.pow(b, 2);
        double e = c + d;
        return Math.sqrt(e);
    }

    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 4;
        int x2 = 4;
        int y2 = 5;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("Расстояние между координатами (" + x1 + ", " + y1 + ") и (" + x2 + ", " + y2 + ") составляет " + result);
    }
}