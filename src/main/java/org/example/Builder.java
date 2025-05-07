package org.example;

public interface Builder {
    Builder size(String size);
    Builder dough(String dough);
    Builder toppings(String toppings);
    Pizza build();
}
