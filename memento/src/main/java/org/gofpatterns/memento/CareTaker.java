package org.gofpatterns.memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CareTaker {
    private TextDocument textDocument;
    private Map<String, Memento> mapVersions = new HashMap<>();

    public CareTaker(TextDocument textDocument) {
        this.textDocument = textDocument;
    }

    public void doMemento(String version) {
        Memento memento = textDocument.createMemento();
        mapVersions.put(version, memento);
    }

    public void restoreMemento(String version) {
        if(mapVersions.containsKey(version)) {
            textDocument.restoreFromMemento(mapVersions.get(version));
        } else {
            System.out.printf("This version %s doesn't exists! Can't restore the memento with this version!", version);

        }
    }
}
