package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, String name2, int age) {
        System.out.println("Привет, " + name + ". Меня зовут " + name2 + ". Мне " + age + " лет.");
    }

    public static void main(String[] args) {
        String name = "Петр";
        String name2 = "Алексей";
        int age = 39;
        ArgMethod.hello(name, name2, age);
    }
}
