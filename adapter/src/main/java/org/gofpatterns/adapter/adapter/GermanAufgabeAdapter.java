package org.gofpatterns.adapter.adapter;

import org.gofpatterns.adapter.germanClass.Aufgabe;

public class GermanAufgabeAdapter implements AufgabeAdapter {

    private Aufgabe task = new Aufgabe();

    @Override
    public String getTitle() {
        return task.titelErhalten();
    }

    @Override
    public void setTitle(String title) {
        task.titelFestlegen(title);
    }

    @Override
    public String getDescription() {
        return task.beschreibungAbrufen();
    }

    @Override
    public void setDescription(String description) {
        task.beschreibungFestlegen(description);
    }
}
