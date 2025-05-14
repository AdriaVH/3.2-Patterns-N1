package org.example;

public class HawaianPizzaBuilder implements Builder {
    private String size;
    private String dough = "hawaianDough";
    private String toppings = "Ham, Pineapple, Mozzarella";

    public Pizza build() {
        return new Pizza(this);
    }

    public HawaianPizzaBuilder() {
    }

    @Override
    public Builder size(String size) {
        this.size = size;
        return this;
    }

    @Override
    public Builder dough(String dough) {
        this.dough += dough;
        return this;
    }

    @Override
    public Builder toppings(String toppings) {
        this.toppings += ", " + toppings;
        return this;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String getDough() {
        return dough;
    }

    @Override
    public String getToppings() {
        return toppings;
    }
}

