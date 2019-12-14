package com.kodilla.patterns2.decorator.pizza.decorators;

import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class ExtraVeganCheeseDecorator extends AbstractPizzaOrderDecorator {
    public ExtraVeganCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" + extra vegan cheese");
    }
}
