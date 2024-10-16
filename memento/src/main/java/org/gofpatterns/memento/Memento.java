package org.gofpatterns.memento;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class Memento {
    private final String text;

    public Memento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
