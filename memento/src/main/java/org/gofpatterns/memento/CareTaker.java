package org.gofpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private TextDocument textDocument;
    private List<String> listVersions = new ArrayList<>();

    public CareTaker(TextDocument textDocument) {
        this.textDocument = textDocument;
    }

    public void doMemento(String version) {
        if(!listVersions.contains(version)) {
            textDocument.createMemento(version);
            listVersions.add(version);
        } else {
            System.out.println("This version %s already exists! Can't create the memento with the same version!");
        }
    }

    public void restoreMemento(String version) {
        if(listVersions.contains(version)) {
            textDocument.restoreFromMemento(version);
        } else {
            System.out.println("This version %s doesn't exists! Can't restore the memento with this version!");

        }
    }
}
