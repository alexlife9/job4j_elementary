package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int sdacha = money - price;
        int size = 0;
        System.out.println(coins.length);
        for (int coin : coins) {
            while (sdacha >= coin) {
                sdacha -= coin;
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] coins = {10, 5, 2, 1};
        System.out.println(coins.length);

    }
}
//6.9. Жадный алгоритм. Сдача в кофе машине
//int[] rsl это массив, содержащий монеты, которыми даем сдачу
//сдача которую надо выдать клиенту
//это количество монет, то есть размер массива rsl
//вычисляем из какой ячейки выдать монету int i = 0; i < coins.length; i++)
//пока сдача не будет равна 0, сыпем сдачу монетами.
//сдача должна быть равна бабки минус прайс
//забираем из массива сдачи еще одну монету