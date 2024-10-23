package org.gofpatterns.visitor.pizza;

public class Ingredient {
    private String title;
    private Integer quantity;

    public Ingredient(String title, Integer quantity) {
        this.title = title;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
