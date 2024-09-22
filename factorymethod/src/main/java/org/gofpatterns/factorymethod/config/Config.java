package org.gofpatterns.factorymethod.config;

import org.gofpatterns.factorymethod.food.*;

import java.util.HashMap;
import java.util.Map;


public class Config {
    public static Map<TypeOfFood, Class<? extends Food>> whatToCook = new HashMap<>();
    static {
        whatToCook.put(TypeOfFood.POTATO, FriedPotatoes.class);
        whatToCook.put(TypeOfFood.MEAT, RoastMeat.class);
        whatToCook.put(TypeOfFood.SALAD, Salad.class);
    }
}
