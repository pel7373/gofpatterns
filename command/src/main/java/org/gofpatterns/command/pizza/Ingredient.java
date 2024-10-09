package org.gofpatterns.command.pizza;

public class Ingredient {
    private FoodType foodType;
    private Integer quantity;

    public Ingredient(FoodType foodType, Integer quantity) {
        this.foodType = foodType;
        this.quantity = quantity;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
