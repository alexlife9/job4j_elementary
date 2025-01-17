package ru.job4j.other;

public class Shufffel {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }

            if (x == 2) {
                System.out.print("b c");
            }
                x = x - 1;
                System.out.print("-");

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}

/**
 * надо получить вывод a-b c-d
 * 1.выполняем пока х > 0
 * 1.при первом проходе условие верно, печатаем А
 * 1.при первом проходе условие не выполняется, ничего не делаем.
 * 1.при первом проходе Х = 3-1 = 2
 * 1.просто без условий печатаем -
 * 1.при первом проходе условие не выполняется так как Х = 2
 * 1.ничего не печатаем
 * 1.выше условие не выполнено, ничего не меням
 * 2. второй проход - условие не выполняется, потому что Х уже = 2
 * 2. при втором проходе ничего не печатаем
 * 2.при втором проходе условие верно
 * 2. печатаем B C
 * 2. при втором проходе меняем Х = 2-1 = 1
 * 2. при втором проходе без условий еще раз печатаем -
 * 2.при втором проходе условие верно Х =1
 * 2.при втором проходе печатаем D
 * 2.при втором проходе условие верно, значит меняем Х = 1-1 = 0
 * 3. начало третьего прохода False, потому что 0 > 0
 */