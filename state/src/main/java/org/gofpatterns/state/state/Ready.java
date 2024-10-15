package org.gofpatterns.state.state;

public class Ready implements State{
    @Override
    public void bake() {
        System.out.println("Start baking!");
    }
}
