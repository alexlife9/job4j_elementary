package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(int rubles) {
        double kursEuro = 70.0;
        return rubles / kursEuro;
    }

    public static double rubleToDollar(int rubles) {
        double kursDollar = 60.0;
        return rubles / kursDollar;
    }

    public static void main(String[] args) {
        int rubles = 140;
        double expected = 2.0;
        double euro = Converter.rubleToEuro(rubles);
        boolean passed = expected == euro;
        double dollar = Converter.rubleToDollar(rubles);
        System.out.println(rubles + " рублей это " + euro + " евро при курсе 70р за 1 евро. Проверка - " + passed);
        System.out.println(rubles + " рублей это " + dollar + " доллар при курсе 60р за один евро");
    }
}
