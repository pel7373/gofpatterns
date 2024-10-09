package org.gofpatterns.command.exception;

public class IngredientListEmptyException extends RuntimeException {
    public IngredientListEmptyException(String message) {
        super(message);
    }
}
