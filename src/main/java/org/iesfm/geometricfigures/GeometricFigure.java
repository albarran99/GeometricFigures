package org.iesfm.geometricfigures;

import java.util.Objects;

public abstract class GeometricFigure {

    private String colour;
    private Double x;
    private Double y;

    public GeometricFigure(String colour, Double x, Double y) {
        this.colour = colour;
        this.x = x;
        this.y = y;
    }

    protected abstract void expecificInfo();

    public void basicInfo() {
        System.out.println("Estoy en las coordenadas " + " x " + x + " y " + y);
        System.out.println("Y soy de color " + colour);
    }

    protected abstract double getArea();

    protected abstract double getPerimetre();

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeometricFigure)) return false;
        GeometricFigure that = (GeometricFigure) o;
        return Objects.equals(colour, that.colour) && Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, x, y);
    }
}
