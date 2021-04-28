package org.iesfm.test;

import org.iesfm.geometricfigures.Square;
import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    private final static double DELTA = 0.000001;

    @Test
    public void SquareAreaTest() {
        Square square = new Square("Red", 2.2, 3.2, 3);

        double result = square.getArea();

        double expected = 9;

        Assert.assertEquals(expected, result, DELTA);

    }

    @Test
    public void SquarePerimetreTest() {
        Square square = new Square("Red", 2.2, 3.2, 3);

        double result = square.getPerimetre();

        double expected = 12;

        Assert.assertEquals(expected, result, DELTA);

    }
}