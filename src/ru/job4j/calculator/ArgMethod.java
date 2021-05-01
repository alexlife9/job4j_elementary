package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Привет, " + name + ". Мне " + age + " года.");
    }

    public static void main(String[] args) {
        String name = "Алексей";
        int age = 33;

        ArgMethod.hello(name, age);
    }
}
