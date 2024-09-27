package org.gofpatterns.adapter.adapter;

import org.gofpatterns.adapter.germanTask.Aufgabe;
import org.gofpatterns.adapter.germanTask.AufgabeImpl;

public class GermanToEnglishTaskAdapter implements TaskAdapter {

    private final Aufgabe germanTask;

    public GermanToEnglishTaskAdapter(Aufgabe germanTask) {
        this.germanTask = germanTask;
    }

    @Override
    public String getTitle() {
        return germanTask.titelErhalten();
    }

    @Override
    public void setTitle(String title) {
        germanTask.titelFestlegen(title);
    }

    @Override
    public String getDescription() {
        return germanTask.beschreibungAbrufen();
    }

    @Override
    public void setDescription(String description) {
        germanTask.beschreibungFestlegen(description);
    }
}
