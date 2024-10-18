package org.gofpatterns.state.state;

import org.gofpatterns.state.exception.ColdStateException;

public class Cold implements State{
    @Override
    public void bake() {
        throw new ColdStateException("The oven is cold!");
    }
}
