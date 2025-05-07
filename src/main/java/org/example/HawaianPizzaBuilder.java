package org.example;

public class HawaianPizzaBuilder implements Builder {
    private String size;
    private String dough;
    private String toppings = "Ham, Pineapple, Mozzarella";

    public Pizza build() {
        return new Pizza(this);
    }

    public HawaianPizzaBuilder() {
    }

    @Override
    public HawaianPizzaBuilder size(String size) {
        this.size = size;
        return this;
    }

    @Override
    public HawaianPizzaBuilder dough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public HawaianPizzaBuilder toppings(String toppings) {
        this.toppings += " " + toppings;
        return this;
    }
}

