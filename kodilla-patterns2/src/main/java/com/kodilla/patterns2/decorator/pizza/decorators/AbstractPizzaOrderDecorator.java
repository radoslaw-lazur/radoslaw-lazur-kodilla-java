package com.kodilla.patterns2.decorator.pizza.decorators;

import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String getDescription() {
        return pizzaOrder.getDescription();
    }
}
