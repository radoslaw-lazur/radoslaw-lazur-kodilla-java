package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPONG";
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "sth", 1);
            case DRIVING:
                return new DrivingTask("Driving", "somewhere", "car");
            case PAINTING:
                return new PaintingTask("Painting", "blue", "wall");
            default:
                return null;
        }
    }
}
