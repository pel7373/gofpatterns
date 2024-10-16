package org.gofpatterns.memento;

public class TextDocument {
    private String text;

    public Memento createMemento() {
        return new Memento(text);
    }

    public void restoreFromMemento(Memento memento) {
        text = memento.getText();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
