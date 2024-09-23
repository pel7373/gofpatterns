package org.gofpatterns.abstractfactory.config;

import org.gofpatterns.abstractfactory.cuisine.*;

import java.util.HashMap;
import java.util.Map;

public class Config {
    public static Map<CuisineFactoryType, CuisineFactory> getCuisine = new HashMap<>();

    static {
        getCuisine.put(CuisineFactoryType.AMERICAN, new AmericanCuisineFactory());
        getCuisine.put(CuisineFactoryType.UKRAINIAN, new UkrainianCuisineFactory());
        getCuisine.put(CuisineFactoryType.JAPAN, new JapanCuisineFactory());
    }
}