package org.gofpatterns.abstractfactory;

import org.gofpatterns.abstractfactory.config.Config;
import org.gofpatterns.abstractfactory.cuisine.CuisineFactory;
import org.gofpatterns.abstractfactory.cuisine.CuisineFactoryType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(CuisineFactoryType.values()).forEach(cuisineType -> {
            if(Config.getCuisine.containsKey(cuisineType)) {
                CuisineFactory cuisineFactory = Config.getCuisine.get(cuisineType);
                System.out.println();
                System.out.println(cuisineFactory);
                System.out.println(cuisineFactory.cookPotato());
                System.out.println(cuisineFactory.cookRoastMeat());
                System.out.println(cuisineFactory.cookSalad());
                System.out.println(cuisineFactory.cookSetLunch());
            } else {
                System.out.printf("Unknown type of cuisine (%s) for cooking! We can't cook!%n", cuisineType.toString());
            }
        });

        System.out.println();
        System.out.println("What do you want? American cuisine potato? Here they are:");
        if(Config.getCuisine.containsKey(CuisineFactoryType.AMERICAN)) {
            System.out.println(Config.getCuisine.get(CuisineFactoryType.AMERICAN).cookPotato());
        } else {
            System.out.println(String.format("Unknown type of cuisine for cooking! We can't cook!"));
        }

        System.out.println();
        System.out.println("What do you want? Ukrainian cuisine roast meat? Here it is:");
        if(Config.getCuisine.containsKey(CuisineFactoryType.UKRAINIAN)) {
            System.out.println(Config.getCuisine.get(CuisineFactoryType.UKRAINIAN).cookRoastMeat());
        } else {
            System.out.println(String.format("Unknown type of cuisine for cooking! We can't cook!"));
        }

        System.out.println();
        System.out.println("What do you want? Japan cuisine set lunch? Here it is:");
        if(Config.getCuisine.containsKey(CuisineFactoryType.JAPAN)) {
            System.out.println(Config.getCuisine.get(CuisineFactoryType.JAPAN).cookSetLunch());
        } else {
            System.out.println(String.format("Unknown type of cuisine for cooking! We can't cook!"));
        }
    }
}
