package org.gofpatterns.composite.tree;

public class Leaf implements Component {
    private int value;

    public Leaf() {
    }

    public Leaf(int value) {
        this.value = value;
    }

    @Override
    public void incrementValue() {
        value++;
    }

    @Override
    public void decrementValue() {
        value--;
    }

    @Override
    public void outputInfo() {
        System.out.printf("Leaf %s has value %d\n", this, value);
    }
}
