package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1); //ищем минимальное значение от нулевого индекса до конца массива
            int index = FindLoop.indexOf(data, min, i, data.length - 1); //ищем индекс этого найденного мимнимального значения
                int temp = data[index];
                data[index] = data[i];
                data[i] = temp;
        }
        return data;
    }
}
