package org.gofpatterns.adapter.germanTask;

public interface Aufgabe {
    public String titelErhalten();

    public void titelFestlegen(String titel);

    public String beschreibungAbrufen();

    public void beschreibungFestlegen(String beschreibung);
}
