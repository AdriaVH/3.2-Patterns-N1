package org.example;

public class Pizza{
    private String size;
    private String dough;
    private String toppings;

    protected Pizza(Builder builder) {
        size = builder.getSize();
        dough = builder.getDough();
        toppings = builder.getToppings();
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

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", dough='" + dough + '\'' +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}


