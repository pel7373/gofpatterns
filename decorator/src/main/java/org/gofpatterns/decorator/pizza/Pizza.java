package org.gofpatterns.decorator.pizza;

public class Pizza implements Food {
    @Override
    public void cook() {
        System.out.println("I'm pizza!");
    }
}
