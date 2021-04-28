package org.iesfm.test;

import org.iesfm.geometricfigures.Rectangle;
import org.junit.Assert;
import org.junit.Test;


public class RectangleTest {

    private final static double DELTA = 0.000001;

    @Test
    public void RectangleAreaTest() {
        Rectangle rectangle = new Rectangle("Red", 4.5, 3.6, 4, 5);

        double result = rectangle.getArea();

        double expected = 20;

        Assert.assertEquals(expected, result, DELTA);

    }

    @Test
    public void RectanglePerimetreTest() {
        Rectangle rectangle = new Rectangle("Red", 4.5, 3.6, 4, 5);

        double result = rectangle.getPerimetre();

        double expected = 18;

        Assert.assertEquals(expected, result, DELTA);

    }
}
