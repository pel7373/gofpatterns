package org.gofpatterns.chainOfResponsibility.emergencyResponder;

import org.gofpatterns.chainOfResponsibility.EmergencyCall;
import org.gofpatterns.chainOfResponsibility.config.Config;
import org.gofpatterns.chainOfResponsibility.exception.InvalidEmergencyCallException;

import java.util.Optional;

public class PoliceResponder extends EmergencyResponder {

    public PoliceResponder() {
        accidentSet = Config.POLICE_ACCIDENT_SET;
    }

    @Override
    public void responce(EmergencyCall emergencyCall) {
        System.out.printf("Police responds to %s!\n", emergencyCall.getMessage());
    }
}
