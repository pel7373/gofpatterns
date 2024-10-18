package org.gofpatterns.memento;

public class TextDocument {
    private String text;
    private Memento memento;

    public TextDocument(Memento memento) {
        this.memento = memento;
    }

    public void createMemento(String version) {
        memento.createMemento(version, text);
    }

    public void restoreFromMemento(String version) {
        text = memento.getMemento(version);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
