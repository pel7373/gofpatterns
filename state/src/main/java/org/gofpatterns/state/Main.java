package org.gofpatterns.state;

import org.gofpatterns.state.state.*;

public class Main {
    public static void main(String[] args) {
        Oven oven = new Oven(new Cold());
        oven.bake();

        oven.setState(new Ready());
        oven.bake();

        oven.setState(new Overheated());
        oven.bake();

        oven.setState(new Cold());
        oven.bake();
    }
}