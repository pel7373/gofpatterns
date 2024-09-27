package org.gofpatterns.builder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .setMushrooms(2.2)
                .setPineapple(3.3)
                .setBacon(1.0)
                .setCheese(2.1)
                .build();
        System.out.println(pizza);

        System.out.println();
        Pizza pizza2 = new Pizza.PizzaBuilder()
                .setPineapple(2.3)
                .setBacon(1.0)
                .setCheese(.7)
                .setSeafood(1.2)
                .build();
        System.out.println(pizza2);
    }
}