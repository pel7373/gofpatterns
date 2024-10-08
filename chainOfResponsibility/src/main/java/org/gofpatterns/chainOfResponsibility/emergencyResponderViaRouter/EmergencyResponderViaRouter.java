package org.gofpatterns.chainOfResponsibility.emergencyResponderViaRouter;

import org.gofpatterns.chainOfResponsibility.EmergencyCall;
import org.gofpatterns.chainOfResponsibility.exception.InvalidEmergencyCallException;

public abstract class EmergencyResponderViaRouter {
    private EmergencyResponderViaRouter nextEmergencyResponder;

    public void handler(EmergencyCall emergencyCall) {
        if(emergencyCall == null || emergencyCall.getMessage() == null) {
            throw new InvalidEmergencyCallException("EmergencyCall or EmergencyCall's message can't be null");
        }

        responce(emergencyCall);

        if(nextEmergencyResponder != null) {
            nextEmergencyResponder.handler(emergencyCall);
        }
    }

    public abstract void responce(EmergencyCall emergencyCall);

    public void setNextEmergencyResponder(EmergencyResponderViaRouter nextEmergencyResponder) {
        this.nextEmergencyResponder = nextEmergencyResponder;
    }
}
