package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(int value) {
        double rsl = value / 70.0;
        return value;
    }

    public static double rubleToDollar(int value) {
        double rsl = value / 60.0; /* формула перевода рублей в доллары. */
        return value;
    }

    public static void main(String[] args) {
        int rubles = 140;
        double euro = Converter.rubleToEuro(rubles);
        double dollar = Converter.rubleToDollar(rubles);
        System.out.println("140 рублей это " + euro + " euro при курсе 70р за 1 евро");
        System.out.println("140 рублей это " + dollar + " dollar при курсе 60р за один евро");
    }
}
