package org.gofpatterns.adapter.germanClass;

public class Aufgabe {
    private String titel;
    private String beschreibung;

    public String titelErhalten() {
      return titel;
    }

    public void titelFestlegen(String titel) {
        this.titel = titel;
    }

    public String beschreibungAbrufen() {
        return beschreibung;
    }

    public void beschreibungFestlegen(String beschreibung) {
        this.beschreibung = beschreibung;
    }
}
