package org.example;

public class PizzaBuilder implements Builder {
    private String size;
    private String dough;
    private String toppings;

    public Pizza build() {
        return new Pizza(this);
    }

    public PizzaBuilder() {
    }

    @Override
    public PizzaBuilder size(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder dough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder toppings(String toppings) {
        this.toppings = toppings;
        return this;
    }
}

