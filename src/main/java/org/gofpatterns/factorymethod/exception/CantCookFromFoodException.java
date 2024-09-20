package org.gofpatterns.factorymethod.exception;

public class CantCookFromFoodException extends RuntimeException {
    public CantCookFromFoodException(String message) {
        super(message);
    }
}
