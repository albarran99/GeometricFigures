package org.iesfm.test;

import org.iesfm.geometricfigures.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    private final static double DELTA = 0.000001;

    @Test
    public void CircleAreaTest() {
        Circle circle = new Circle("Red", 3.4, 4.5, 10);

        double result = circle.getArea();

        double expected = 314.1592653589793;

        Assert.assertEquals(expected, result, DELTA);

    }

    @Test
    public void CirclePerimetreTest() {
        Circle circle = new Circle("Red", 3.4, 4.5, 10);

        double result = circle.getPerimetre();

        double expected = 62.83185307179586;

        Assert.assertEquals(expected, result, DELTA);

    }
}
