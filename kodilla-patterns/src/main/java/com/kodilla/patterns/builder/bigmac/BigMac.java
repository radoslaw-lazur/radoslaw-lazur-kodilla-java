package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final String bun;
    private final String sauce;
    private final double burgers;
    private final List<String> ingredients;

    public static class BigMacBuilder {
       private String bun;
       private String sauce;
       private double burgers;
       private List<String> ingredients = new ArrayList<>();

       public BigMacBuilder bun(String bun) {
           this.bun = bun;
           return this;
       }

       public BigMacBuilder sauce(String sauce) {
           this.sauce = sauce;
           return this;
       }

       public BigMacBuilder burgers(double burgers) {
           this.burgers = burgers;
           return this;
       }

       public BigMacBuilder ingredient(String ingredient) {
           ingredients.add(ingredient);
           return this;
       }

       public BigMac build() {
           return new BigMac(bun, sauce, burgers, ingredients);
       }
    }

    private BigMac(final String bun, final String sauce, final double burgers, List<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", burgers=" + burgers +
                ", ingrediens=" + ingredients +
                '}';
    }
}
