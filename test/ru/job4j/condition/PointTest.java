package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when01to21then2() {
        int expected = 2;
        Point a = new Point(0, 1);
        Point b = new Point(2, 1);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when11to12then2() {
        int expected = 1;
        Point a = new Point(1, 1);
        Point b = new Point(1, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when211to122thenAB2() {
        double expected = 1.73;
        Point a = new Point(2, 1, 1);
        Point b = new Point(1, 2, 2);
        Point c = new Point(0, 2, 3);
        double dist3d = a.distance3d(b);
        Assert.assertEquals(expected, dist3d, 0.01);
    }

    @Test
    public void when122to023thenBC2() {
        double expected = 1.41;
        Point a = new Point(2, 1, 1);
        Point b = new Point(1, 2, 2);
        Point c = new Point(0, 2, 3);
        double dist3d = b.distance3d(c);
        Assert.assertEquals(expected, dist3d, 0.01);
    }

    @Test
    public void when211to023thenAC3() {
        double expected = 3.0;
        Point a = new Point(2, 1, 1);
        Point b = new Point(1, 2, 2);
        Point c = new Point(0, 2, 3);
        double dist3d = a.distance3d(c);
        Assert.assertEquals(expected, dist3d, 0.01);
    }
}
