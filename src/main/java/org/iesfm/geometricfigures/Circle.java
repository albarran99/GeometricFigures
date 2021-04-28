package org.iesfm.geometricfigures;

import java.util.Objects;

public class Circle extends GeometricFigure {
    private double radius;

    public Circle(String colour, Double x, Double y, double radius) {
        super(colour, x, y);
        this.radius = radius;
    }

    @Override
    protected void expecificInfo() {
        System.out.println("Soy un Circulo");
        System.out.println("Mi radio es " + radius);
    }

    @Override
    public void basicInfo() {
        super.basicInfo();
        expecificInfo();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimetre() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
