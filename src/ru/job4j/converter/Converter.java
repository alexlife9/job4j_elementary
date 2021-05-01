package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 рублей это " + euro + " euro при курсе 70р за 1 евро");
        System.out.println("140 рублей это " + dollar + " dollar при курсе 60р за один евро, но это не точно :)");
    }
}
