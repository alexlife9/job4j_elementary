package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = point + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        String temp = array[i];
                        array[i] = array[index];
                        array[index] = temp;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
//узнаем длину массива строк
//если значение индекса равно 0, то
//указатель на null ячейку. вводим переменную  point со значением index
// для массива от null (и смотрим следующий индекс +1) узнаем длину массива оставших значений строк
// если значение индекса нового массива не равно null, то меняем местами null и найденное значение