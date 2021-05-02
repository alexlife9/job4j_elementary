package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int rubles = 150;
        double expectedE = 1.5;
        double euro = Converter.rubleToEuro(rubles);
        Assert.assertEquals(expectedE, euro);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
    }
}