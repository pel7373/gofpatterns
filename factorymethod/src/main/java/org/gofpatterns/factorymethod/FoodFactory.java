package org.gofpatterns.factorymethod;

import org.gofpatterns.factorymethod.config.Config;
import org.gofpatterns.factorymethod.exception.CantCookFromFoodException;
import org.gofpatterns.factorymethod.exception.FoodNotFoundException;
import org.gofpatterns.factorymethod.food.*;

import java.lang.reflect.InvocationTargetException;

public class FoodFactory {

    public Food cook(TypeOfFood typeOfFood) {
        if(Config.whatToCook.containsKey(typeOfFood)) {
            try {
                return Config.whatToCook.get(typeOfFood).getDeclaredConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new CantCookFromFoodException(String.format("Can't cook from %s, we're very sorry!", typeOfFood.toString()));
            }
        }
        throw new FoodNotFoundException(String.format("Unknown type of food (%s) for cooking! We can't cook!", typeOfFood.toString()));
    }
}
