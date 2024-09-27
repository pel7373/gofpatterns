package org.gofpatterns.singleton.exception;

public class IncorrectInstanceNumber extends RuntimeException {
    public IncorrectInstanceNumber(String message) {
        super(message);
    }
}
