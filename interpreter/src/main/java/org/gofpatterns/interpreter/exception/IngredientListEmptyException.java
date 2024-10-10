package org.gofpatterns.interpreter.exception;

public class IngredientListEmptyException extends RuntimeException {
    public IngredientListEmptyException(String message) {
        super(message);
    }
}
