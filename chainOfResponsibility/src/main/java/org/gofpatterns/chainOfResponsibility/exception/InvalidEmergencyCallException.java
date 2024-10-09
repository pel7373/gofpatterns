package org.gofpatterns.chainOfResponsibility.exception;

import java.util.function.Supplier;

public class InvalidEmergencyCallException extends RuntimeException {
    public InvalidEmergencyCallException(String message) {
        super(message);
    }

}
