package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


    ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public void removeFigure(Shape shape){
       figures.remove(shape);
    }
    public int getQuantityFigures(){
        return figures.size();
    }

    public String getFigure(int n){
       return figures.get(n).getShape();
    }

    public void showFigures(){
        for(int i = 0; i < figures.size(); i++){
            System.out.println(figures.get(i).getShape() +
                    " field: " + figures.get(i).getField());

        }
    }
}
