package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int rubles = 150;
        double expected = 1.5;
        double euro = Converter.rubleToEuro(rubles);
        Assert.assertEquals(expected, euro);
    }
}
