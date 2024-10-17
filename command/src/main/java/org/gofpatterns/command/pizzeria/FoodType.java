package org.gofpatterns.command.pizzeria;

public enum FoodType {
    CHEESE ("cheese"),
    BACON ("bacon"),
    PINEAPPLE ("pineapple"),
    MUSHROOMS ("mushrooms"),
    SEAFOOD ("seafood");

    private final String title;

    FoodType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
