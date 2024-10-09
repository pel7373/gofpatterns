package org.gofpatterns.chainOfResponsibility;

public class EmergencyCall {
    private String message;

    public EmergencyCall(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
