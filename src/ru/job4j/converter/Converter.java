package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(int rubles) {
        double kursEuro = 100.0;
        return rubles / kursEuro;
    }

    public static double rubleToDollar(int rubles) {
        double kursDollar = 5.0;
        return rubles / kursDollar;
    }

    public static void main(String[] args) {
        int rubles = 150;
        double expectedE = 1.5;
        double expectedD = 30;
        double euro = Converter.rubleToEuro(rubles);
        boolean passedE = expectedE == euro;
        double dollar = Converter.rubleToDollar(rubles);
        boolean passedD = expectedD == dollar;
        System.out.println(rubles + " рублей это " + euro + " евро при курсе 100р за 1 евро. Проверка - " + passedE);
        System.out.println(rubles + " рублей это " + dollar + " доллар при курсе 5р за 1 доллар. Проверка - " + passedD);
    }
}
