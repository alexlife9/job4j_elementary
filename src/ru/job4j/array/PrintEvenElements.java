package ru.job4j.array;

public class PrintEvenElements {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Текущий элемент массива начиная с последнего: "
                            + numbers[numbers.length - 1 - i]
            );
        }

        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[numbers.length - 1];
            numbers[numbers.length - 1] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
            System.out.println(
                    "Текущий элемент массива начиная с первого: "
                            + numbers[numbers.length - temp]
            );
        }

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers.length - (1 + i)) % 2 == 0) {
                System.out.println("Четные элементы массива начиная с последнего: " + numbers[numbers.length - (i + 1)]);
            }
        }
    }
}