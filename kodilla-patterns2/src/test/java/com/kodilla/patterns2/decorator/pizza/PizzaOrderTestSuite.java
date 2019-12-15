package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.decorators.*;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    private PizzaOrder pizza = new BasicPizzaOrder();

    @Before
    public void before() {
        pizza = new BasicPizzaOrder();
    }

    @Test
    public void testPizza1() {
        //Given
        pizza = new MushroomDecorator(pizza);
        pizza = new OnionDecorator(pizza);
        pizza = new SpinachDecorator(pizza);
        pizza = new SchipingDecorator(pizza);
        //When
        BigDecimal theCost = pizza.getCost();
        String description = pizza.getDescription();
        System.out.println(description + "Cost: " + theCost + " PLN");
        //Then
        assertEquals(new BigDecimal(28), theCost);
        assertEquals("Pizza based on vegan cheese and tomato sauce + mushrooms + onion" +
                " + spinach + shipping", description);
    }

    @Test
    public void testPizza2() {
        //Given
        pizza = new MushroomDecorator(pizza);
        pizza = new SpinachDecorator(pizza);
        pizza = new SchipingDecorator(pizza);
        //When
        BigDecimal theCost = pizza.getCost();
        String description = pizza.getDescription();
        System.out.println(description + "Cost: " + theCost + " PLN");
        //Then
        assertEquals(new BigDecimal(26), theCost);
        assertEquals("Pizza based on vegan cheese and tomato sauce + mushrooms" +
                " + spinach + shipping", description);
    }

    @Test
    public void testPizza3() {
        //Given
        pizza = new MushroomDecorator(pizza);
        pizza = new SpinachDecorator(pizza);
        pizza = new ExtraVeganCheeseDecorator(pizza);
        pizza = new SchipingDecorator(pizza);
        //When
        BigDecimal theCost = pizza.getCost();
        String description = pizza.getDescription();
        System.out.println(description + "Cost: " + theCost + " PLN");
        //Then
        assertEquals(new BigDecimal(30), theCost);
        assertEquals("Pizza based on vegan cheese and tomato sauce + mushrooms + spinach + extra vegan cheese + shipping", description);
    }
}
