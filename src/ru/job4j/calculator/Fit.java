package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short heightM) {
        return (heightM - 100) * 1.15;
    }

    public static double womanWeight(short heightW) {
        return (heightW - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightM = 187;
        short heightW = 150;
        double man = Fit.manWeight(heightM);
        double woman = Fit.womanWeight(heightW);
        System.out.println("Мужчина при росте " + heightM + "см должен весить " + man + "кг");
        System.out.println("Женщина при росте " + heightW + "см должна весить " + woman + "кг");
    }
}
