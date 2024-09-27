package org.gofpatterns.builder;

public class Pizza {
    private double cheese;
    private double bacon;
    private double pineapple;
    private double mushrooms;
    private double seafood;

    public Pizza() {

    }

    public Pizza(double cheese, double bacon, double pineapple, double mushrooms, double seafood) {
        this.cheese = cheese;
        this.bacon = bacon;
        this.pineapple = pineapple;
        this.mushrooms = mushrooms;
        this.seafood = seafood;
    }

    public static class PizzaBuilder {
        private double cheese;
        private double bacon;
        private double pineapple;
        private double mushrooms;
        private double seafood;

        public PizzaBuilder setCheese(double cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder setBacon(double bacon) {
            this.bacon = bacon;
            return this;
        }

        public PizzaBuilder setPineapple(double pineapple) {
            this.pineapple = pineapple;
            return this;
        }

        public PizzaBuilder setMushrooms(double mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        public PizzaBuilder setSeafood(double seafood) {
            this.seafood = seafood;
            return this;
        }

        public Pizza build() {
            return new Pizza(cheese, bacon, pineapple, mushrooms, seafood);
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
