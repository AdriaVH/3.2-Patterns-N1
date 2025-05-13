package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        Pizza fina = pizzaBuilder.size("12").dough("Fina").build();

        HawaianPizzaBuilder hawaianBuilder = new HawaianPizzaBuilder();

        Pizza hawaianPizza = hawaianBuilder.size("24").dough("thick").toppings("Pesto").build();
        PizzaMaster luigi = new PizzaMaster();
        Pizza adriaPizza = luigi.upgradeDoughCheeseCrust(hawaianBuilder);
        System.out.println(hawaianPizza);
        System.out.println(fina);

    }
}
