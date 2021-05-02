package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int rubles = 140;
        double expectedE = 2;
        double euro = Converter.rubleToEuro(rubles);
        Assert.assertEquals(expectedE, euro, 0.01);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int rubles = 180;
        double expectedD = 3;
        double dollar = Converter.rubleToDollar(rubles);
        Assert.assertEquals(expectedD, dollar, 0.01);
    }
}