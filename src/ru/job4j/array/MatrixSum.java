package ru.job4j.array;

public class MatrixSum {

    public static int sum(int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) { //извлекаем вложенный массив по индексу и определяем его длину, вызывая поле length
                int val = array[row][cell];
                rsl += val;
            }
        }
        return rsl;
    }
}
