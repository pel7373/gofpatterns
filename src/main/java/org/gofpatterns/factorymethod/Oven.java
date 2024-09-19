package org.gofpatterns.factorymethod;


import org.gofpatterns.factorymethod.food.Food;
import org.gofpatterns.factorymethod.food.IngredientType;

public class Oven {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        Food food = foodFactory.cook(IngredientType.MEAT);
        System.out.println(food);

        food = foodFactory.cook(IngredientType.POTATO);
        System.out.println(food);

        food = foodFactory.cook(IngredientType.SALAD);
        System.out.println(food);
    }
}
