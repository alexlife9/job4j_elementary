package ru.job4j.condition;

public class Max {

    public static int add(int first, int second) {
        return first > second ? first : second;
    }

    public int add(int first, int second, int third) {
        int tmp = add(second, third);
        return add(first, tmp);
    }

    public int add(int first, int second, int third, int fourth) {
        int tmp = add(second, third, fourth);
        return add(first, tmp);
    }
}