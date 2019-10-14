package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;
import java.util.Objects;

public class TaskFactoryTestSuite {

    private TaskFactory factory = new TaskFactory();

    @Test
    public void testFactoryDriving() {
        //Given
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //When
        String name = Objects.requireNonNull(driving).getTaskName();
        driving.executeTask();
        boolean result = driving.isTaskExecuted();
        //Then
        Assert.assertEquals("Driving", name);
        Assert.assertTrue(result);
    }

    @Test
    public void testFactoryPainting() {
        //Given
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //When
        String name = Objects.requireNonNull(painting).getTaskName();
        painting.executeTask();
        boolean result = painting.isTaskExecuted();
        //Then
        Assert.assertEquals("Painting", name);
        Assert.assertTrue(result);
    }

    @Test
    public void testFactoryShopping() {
        //Given
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //When
        String name = Objects.requireNonNull(shopping).getTaskName();
        shopping.executeTask();
        boolean result = shopping.isTaskExecuted();
        //Then
        Assert.assertEquals("Shopping", name);
        Assert.assertTrue(result);
    }
}
