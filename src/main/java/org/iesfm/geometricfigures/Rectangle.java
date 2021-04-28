package org.iesfm.geometricfigures;

import java.util.Objects;

public class Rectangle extends GeometricFigure {
    private double sideOne;
    private double sideTwo;


    public Rectangle(String colour, Double x, Double y, double sideOne, double sideTwo) {
        super(colour, x, y);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    protected void expecificInfo() {
        System.out.println("Soy un Rectangulo");
        System.out.println("Mi altura es " + sideOne + " y mi base es " + sideTwo);
    }

    @Override
    public void basicInfo() {
        super.basicInfo();
        expecificInfo();
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public double getPerimetre() {
        return 2 * sideOne + 2 * sideTwo;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideOne, sideOne) == 0 && Double.compare(rectangle.sideTwo, sideTwo) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sideOne, sideTwo);
    }
}
