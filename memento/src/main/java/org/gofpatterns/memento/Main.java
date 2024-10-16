package org.gofpatterns.memento;

import org.w3c.dom.Text;

public class Main {
    public static void main(String[] args) {
        TextDocument textDocument = new TextDocument();
        CareTaker careTaker = new CareTaker(textDocument);
        textDocument.setText("text1");
        System.out.printf("Now TextDocument contains text: %s\n", textDocument.getText());

        System.out.println("Create 1st memento");
        careTaker.doMemento("version 1.0");

        textDocument.setText("text2");
        System.out.printf("Version 2.0. Now TextDocument contains text: %s\n", textDocument.getText());
        System.out.println("Create 2st memento");
        careTaker.doMemento("version 2.0");

        System.out.println("Restore 1st memento - version 1.0");
        careTaker.restoreMemento("version 1.0");
        System.out.printf("Now TextDocument contains text: %s\n", textDocument.getText());

        System.out.println("Try to restore the memento, that doesn't exist - version 3.0");
        careTaker.restoreMemento("version 3.0");
    }
}