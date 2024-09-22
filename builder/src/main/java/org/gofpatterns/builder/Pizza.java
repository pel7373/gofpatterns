package org.gofpatterns.builder;

public class Pizza {
    private double cheese;
    private double bacon;
    private double pineapple;
    private double mushrooms;
    private double seafood;

    public static class PizzaBuilder {
        private Pizza pizza = new Pizza();

        public PizzaBuilder setCheese(double cheese) {
            pizza.cheese = cheese;
            return this;
        }

        public PizzaBuilder setBacon(double bacon) {
            pizza.bacon = bacon;
            return this;
        }

        public PizzaBuilder setPineapple(double pineapple) {
            pizza.pineapple = pineapple;
            return this;
        }

        public PizzaBuilder setMushrooms(double mushrooms) {
            pizza.mushrooms = mushrooms;
            return this;
        }

        public PizzaBuilder setSeafood(double seafood) {
            pizza.seafood = seafood;
            return this;
        }

        public Pizza build() {
            return pizza;
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheese=" + cheese +
                ", bacon=" + bacon +
                ", pineapple=" + pineapple +
                ", mushrooms=" + mushrooms +
                ", seafood=" + seafood +
                '}';
    }

    public double getSeafood() {
        return seafood;
    }

    public void setSeafood(double seafood) {
        this.seafood = seafood;
    }

    public double getMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(double mushrooms) {
        this.mushrooms = mushrooms;
    }

    public double getPineapple() {
        return pineapple;
    }

    public void setPineapple(double pineapple) {
        this.pineapple = pineapple;
    }

    public double getBacon() {
        return bacon;
    }

    public void setBacon(double bacon) {
        this.bacon = bacon;
    }

    public double getCheese() {
        return cheese;
    }

    public void setCheese(double cheese) {
        this.cheese = cheese;
    }
}
