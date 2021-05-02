package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(int rubles) {
        double kursEuro = 100.0;
        return rubles / kursEuro;
    }

    public static double rubleToDollar(int rubles) {
        double kursDollar = 50.0;
        return rubles / kursDollar;
    }

    public static void main(String[] args) {
        int rubles = 150;
        double expectedE = 1.5;
        double expectedD = 1.5;
        double euro = Converter.rubleToEuro(rubles);
        boolean passedE = expectedE == euro;
        double dollar = Converter.rubleToDollar(rubles);
        boolean passedD = expectedD == euro;
        System.out.println(rubles + " рублей это " + euro + " евро при курсе 70р за 1 евро. Проверка - " + passedE);
        System.out.println(rubles + " рублей это " + dollar + " доллар при курсе 60р за 1 доллар. Проверка -" + passedD);
    }
}
