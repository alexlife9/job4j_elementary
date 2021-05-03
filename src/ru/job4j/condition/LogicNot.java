package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) { /* проверяет что число четное */
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) { /* проверяет что число положительное*/
        return num > 0;
    }

    public static boolean notEven(int num) { /*проверяет что число НЕчетное*/
        return !isEven(num);
    }

    public static boolean notPositive(int num) { /*проверяет, что число не положительное*/
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) { /*проверяет, что число нечетное и положительное;*/
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) { /*проверяет, что число четное или не положительное*/
        return isEven(num) || !isPositive(num);
    }

}
