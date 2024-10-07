package org.calculator.exception;

public class InvalidOperationException extends RuntimeException{
    public InvalidOperationException(String message) {
        super(message);
    }
}
