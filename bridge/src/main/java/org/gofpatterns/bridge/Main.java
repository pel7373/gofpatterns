package org.gofpatterns.bridge;

import org.gofpatterns.bridge.cuisine.AmericanCuisine;
import org.gofpatterns.bridge.cuisine.Cuisine;
import org.gofpatterns.bridge.cuisine.JapanCuisine;
import org.gofpatterns.bridge.cuisine.UkrainianCuisine;
import org.gofpatterns.bridge.food.*;

public class Main {
    public static void main(String[] args) {
        Food food = new FirstCourse(new AmericanCuisine());
        System.out.println(food.cook());

        Food food2 = new SecondCourse(new UkrainianCuisine());
        System.out.println(food2.cook());

        Food food3 = new ThirdCourse(new JapanCuisine());
        System.out.println(food3.cook());

        Food food4 = new Dessert(new JapanCuisine());
        System.out.println(food4.cook());
    }
}