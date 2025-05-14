package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        Pizza fina = pizzaBuilder.size("12").dough("Fina").build();

        HawaianPizzaBuilder hawaianBuilder = new HawaianPizzaBuilder();

        Pizza hawaianPizzaPlusPesto = hawaianBuilder.size("24").toppings("Pesto").build();
        PizzaMaster luigi = new PizzaMaster();
        luigi.upgradeDoughCheeseCrust(hawaianBuilder);
        Pizza hawaianPizzaExtraCrust = hawaianBuilder.build();

        System.out.println(fina);
        System.out.println(hawaianPizzaPlusPesto);
        System.out.println(hawaianPizzaExtraCrust);


    }
}
