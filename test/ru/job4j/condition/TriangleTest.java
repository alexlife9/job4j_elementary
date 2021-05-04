package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenAB10AC10BC10Exist() {
        double ab = 1.0;
        double ac = 1.0;
        double bc = 1.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenAB01AC00BC10Exist() {
        double ab = 0.1;
        double ac = 0.0;
        double bc = 1.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}
