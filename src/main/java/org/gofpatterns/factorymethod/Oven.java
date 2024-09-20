package org.gofpatterns.factorymethod;


import org.gofpatterns.factorymethod.food.Food;
import org.gofpatterns.factorymethod.food.IngredientType;

import java.util.Arrays;

public class Oven {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        Arrays.stream(IngredientType.values()).forEach(ingredients -> {
            try{
                Food food = foodFactory.cook(ingredients);
                System.out.println(food);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }
}
