package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShape(){
        return "Circle: " + this.radius;
    }

    public double getField(){
        return 3.14 * (this.radius * this.radius);
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
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}

