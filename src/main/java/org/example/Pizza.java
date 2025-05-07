package org.example;

public class Pizza{
    private String size;
    private String dough;
    private String toppings;

    protected Pizza(Builder builder) {
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


