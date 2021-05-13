package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort3() {
        int[] data = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {6, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 4, 5, 6};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort4() {
        int[] data = new int[] {3, 1, 6, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 6};
        Assert.assertArrayEquals(expected, result);
    }
}
