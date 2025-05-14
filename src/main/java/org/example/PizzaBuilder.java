package org.example;

public class PizzaBuilder implements Builder {
    private String size = "";
    private String dough = "";
    private String toppings = "";

    public Pizza build() {
        return new Pizza(this);
    }

    public PizzaBuilder() {
    }

    @Override
    public Builder size(String size) {
        this.size += size;
        return this;
    }

    @Override
    public Builder dough(String dough) {
        this.dough += dough;
        return this;
    }

    @Override
    public Builder toppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    public String getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public String getToppings() {
        return toppings;
    }
}

