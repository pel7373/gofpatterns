package org.gofpatterns.factorymethod;

import org.gofpatterns.factorymethod.config.Config;
import org.gofpatterns.factorymethod.exception.CantCookFromFoodException;
import org.gofpatterns.factorymethod.exception.FoodNotFoundException;
import org.gofpatterns.factorymethod.food.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class FoodFactory {
    static Map<IngredientType, Class<? extends Food>> whatToCook = Config.whatToCook;

    public Food cook(IngredientType ingredients) {
        if(whatToCook.containsKey(ingredients)) {
            try {
                return whatToCook.get(ingredients).getDeclaredConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new CantCookFromFoodException(String.format("Can't cook from %s, we're very sorry!", ingredients.toString()));
            }
        }
        throw new FoodNotFoundException(String.format("Unknown type of food (%s) for cooking! We can't cook!", ingredients.toString()));
    }
}
