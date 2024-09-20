package org.gofpatterns.factorymethod.config;

import org.gofpatterns.factorymethod.food.*;

import java.util.HashMap;
import java.util.Map;


public class Config {
    public static Map<IngredientType, Class<? extends Food>> whatToCook = new HashMap<>();
    static {
        whatToCook.put(IngredientType.POTATO, FriedPotatoes.class);
        whatToCook.put(IngredientType.MEAT, RoastMeat.class);
        //whatToCook.put(IngredientType.SALAD, Salad.class);
    }
}
