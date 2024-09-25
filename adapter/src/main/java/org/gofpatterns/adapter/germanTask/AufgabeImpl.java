package org.gofpatterns.adapter.germanTask;

public class AufgabeImpl implements Aufgabe {
    private String titel;
    private String beschreibung;

    public AufgabeImpl() {
    }

    public AufgabeImpl(String titel, String beschreibung) {
        this.titel = titel;
        this.beschreibung = beschreibung;
    }

    @Override
    public String titelErhalten() {
      return titel;
    }

    @Override
    public void titelFestlegen(String titel) {
        this.titel = titel;
    }

    @Override
    public String beschreibungAbrufen() {
        return beschreibung;
    }

    @Override
    public void beschreibungFestlegen(String beschreibung) {
        this.beschreibung = beschreibung;
    }
}
