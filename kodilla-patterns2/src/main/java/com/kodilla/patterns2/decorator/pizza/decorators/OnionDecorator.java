package com.kodilla.patterns2.decorator.pizza.decorators;

import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class OnionDecorator extends AbstractPizzaOrderDecorator {
    public OnionDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" + onion");
    }
}
