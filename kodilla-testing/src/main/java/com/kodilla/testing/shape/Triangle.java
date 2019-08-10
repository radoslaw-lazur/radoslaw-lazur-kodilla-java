package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

    private double side, height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public String getShape(){
        return "Triangle side: " + this.side + " and height " + this.height;
    }

    public double getField(){

        return 0.5 * this.side * this.height;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.side, side) == 0 &&
                Double.compare(triangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side, height);
    }
}
