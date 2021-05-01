package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(int rubles) {
        double kurs_euro = 70.0;
        double rsl = rubles / kurs_euro;
        return rsl;
    }

    public static double rubleToDollar(int rubles) {
        double kurs_dollar = 60.0;
        double rsl = rubles / kurs_dollar;
        return rsl;
    }

    public static void main(String[] args) {
        int rubles = 140;
        double euro = Converter.rubleToEuro(rubles);
        double dollar = Converter.rubleToDollar(rubles);
        System.out.println(rubles + " рублей это " + euro + " евро при курсе 70р за 1 евро");
        System.out.println(rubles + " рублей это " + dollar + " доллар при курсе 60р за один евро");
    }
}
