package org.gofpatterns.chainOfResponsibility.emergencyResponder;

import org.gofpatterns.chainOfResponsibility.EmergencyCall;
import org.gofpatterns.chainOfResponsibility.config.Config;

public class AmbulanceResponder extends EmergencyResponder {
    public AmbulanceResponder() {
        accidentSet = Config.AMBULANCE_ACCIDENT_SET;
    }

    @Override
    public void responce(EmergencyCall emergencyCall) {
        System.out.printf("Ambulance responds to %s!\n", emergencyCall.getMessage());
    }
}
