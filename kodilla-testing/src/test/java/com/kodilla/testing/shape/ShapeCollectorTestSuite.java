package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @Before
    public void before() { System.out.println("Test Case: begin"); }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testAddFigure(){
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        // When
        shapeCollector.addFigure(new Circle(5.5));
        // Then
        Assert.assertEquals(1, shapeCollector.getQuantityFigures());
    }

    @Test
    public void testRemoveFigure(){
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(5.5));
        // When
        shapeCollector.removeFigure(new Circle(5.5));
        // Then
        Assert.assertEquals(0, shapeCollector.getQuantityFigures());
    }

    @Test
    public void testGetFigure(){
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(5));
        // When
        String string = shapeCollector.getFigure(0);
        // Then
        Assert.assertEquals("Circle: 5.0", string);
    }

    @Test
    public void testShowFigures(){
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(2));
        shapeCollector.addFigure(new Square(2));
        shapeCollector.addFigure(new Triangle(2,2));
        // When
        shapeCollector.showFigures();
        // Then
        Assert.assertEquals(3, shapeCollector.figures.size());
    }

}
