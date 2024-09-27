package org.gofpatterns.abstractfactory.config;

import org.gofpatterns.abstractfactory.cuisine.*;

import java.util.HashMap;
import java.util.Map;

public class Config {
    public static Map<CuisineFactoryType, CuisineFactory> getCuisine = new HashMap<>();

    static {
        getCuisine.put(CuisineFactoryType.AMERICAN, new CuisineFactoryAmerican());
        getCuisine.put(CuisineFactoryType.UKRAINIAN, new CuisineFactoryUkrainian());
        getCuisine.put(CuisineFactoryType.JAPAN, new CuisineFactoryJapan());
    }
}