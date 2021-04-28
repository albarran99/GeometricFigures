package org.iesfm.geometricfigures;

import java.util.Objects;

public class Square extends GeometricFigure {
    private double side;

    public Square(String colour, Double x, Double y, double side) {
        super(colour, x, y);
        this.side = side;
    }

    @Override
    protected void expecificInfo() {
        System.out.println("Soy un Cuadrado");
        System.out.println("Mi lado mide " + side);
    }

    @Override
    public void basicInfo() {
        super.basicInfo();
        expecificInfo();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimetre() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}
