package ru.job4j.condition;

public class Game3 {
    public static int checkGame(double percent, int prize, int pay) {
        int profit = (int) (percent * prize);
        if (percent * prize > pay) {
            return profit - pay;
        } else if (profit - pay <= 0) {
            return 0;
        }
        return 0;
    }
}
//5. Стоит ли играть?
//Метод принимает 3 параметра:
//1. Вероятность выигрыша;
//2. Стоимость выигрыша;
//3. Цена игры.
//Необходимо реализовать метод так, чтобы при условии,
// что сумма выигрыша (произведение вероятности и стоимости выигрыша) превышает цену игры,
// метод вернул разницу между этими величинами (т.е. чистую прибыль),
// или вернул 0 (при условии что чистая прибыль меньше или равна 0).