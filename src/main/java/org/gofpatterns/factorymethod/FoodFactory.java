package org.gofpatterns.factorymethod;

import org.gofpatterns.factorymethod.food.*;

public class FoodFactory {
    public Food cook(IngredientType ingredients) {
        switch (ingredients) {
            case POTATO -> {
                return new FriedPotatoes();
            }
            case MEAT -> {
                return new RoastMeat();
            }
            case SALAD -> {
                return new Salad();
            }
            default -> throw new org.factory.exception.FoodNotFoundException("Unknown type of food for cooking! We can't cook!");
        }
    }
}
