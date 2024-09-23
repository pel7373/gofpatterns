package org.gofpatterns.abstractfactory.cuisine;

import org.gofpatterns.abstractfactory.food.Potato;
import org.gofpatterns.abstractfactory.food.RoastMeat;
import org.gofpatterns.abstractfactory.food.Salad;
import org.gofpatterns.abstractfactory.food.LunchSet;

public abstract class CuisineFactory {
    public abstract Potato cookPotato();
    public abstract RoastMeat cookRoastMeat();
    public abstract Salad cookSalad();
    public abstract LunchSet cookSetLunch();
}
