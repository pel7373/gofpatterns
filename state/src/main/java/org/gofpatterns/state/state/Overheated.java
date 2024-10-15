package org.gofpatterns.state.state;

import org.gofpatterns.state.exception.OverheatedStateException;

public class Overheated implements State {
    @Override
    public void bake() {
        throw new OverheatedStateException("The oven is overheated!");
    }
}
