package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100]; //это массив, содержащий монеты, которыми дали сдачу
        int moneySdacha = money - price; // сдача которую надо выдать клиенту
        int size = 0; // это количество монет, то есть размер массива rsl
        for (int i = 0; i < coins.length; i++) { //вычисляем из какой ячейки выдать монету
            while (coins[i] >= moneySdacha) { // пока сдача не будет равна 0, сыпем сдачу монетами.
            moneySdacha = moneySdacha - coins[i]; //сдача должна быть равна бабки минус прайс
                rsl[size] = rsl[size] - size; //забираем из массива сдачи еще одну монету

            }

        }
        return Arrays.copyOf(rsl, size);
    }
}