package org.gofpatterns.chainOfResponsibility.emergencyResponder;

import org.gofpatterns.chainOfResponsibility.EmergencyCall;
import org.gofpatterns.chainOfResponsibility.exception.InvalidEmergencyCallException;

import java.util.Optional;
import java.util.Set;

public abstract class EmergencyResponder {
    private EmergencyResponder nextEmergencyResponder;
    protected Set<String> accidentSet;

    public void handler(EmergencyCall emergencyCall) {
        if(emergencyCall == null) {
            throw new InvalidEmergencyCallException("EmergencyCall can't be null");
        }

        if(accidentSet.contains(
                Optional.ofNullable(
                    emergencyCall.getMessage())
                        .orElseThrow(() -> new InvalidEmergencyCallException("EmergencyCall's message is null")))) {
            responce(emergencyCall);
        }

        if(nextEmergencyResponder != null) {
            nextEmergencyResponder.handler(emergencyCall);
        }
    }

    public abstract void responce(EmergencyCall emergencyCall);

    public void setNextEmergencyResponder(EmergencyResponder nextEmergencyResponder) {
        this.nextEmergencyResponder = nextEmergencyResponder;
    }
}
