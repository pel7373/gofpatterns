package org.gofpatterns.memento;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class Memento {
    private Map<String, String> mementoMap = new HashMap<>();

    public void createMemento(String version, String text) {
        mementoMap.put(version, text);
    }

    public String getMemento(String version) {
        return mementoMap.get(version);
    }
}
