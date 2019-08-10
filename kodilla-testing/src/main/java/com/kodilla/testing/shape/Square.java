package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public String getShape(){
        return "Squre: " + this.side;
    }

    public double getField(){
        return this.side * this.side;
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
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

}
