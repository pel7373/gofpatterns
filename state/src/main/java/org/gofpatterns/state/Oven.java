package org.gofpatterns.state;

import org.gofpatterns.state.exception.ColdStateException;
import org.gofpatterns.state.exception.OverheatedStateException;
import org.gofpatterns.state.state.State;

public class Oven {
    State state;

    public Oven(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void bake() {
        try {
            state.bake();
        } catch (ColdStateException | OverheatedStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
