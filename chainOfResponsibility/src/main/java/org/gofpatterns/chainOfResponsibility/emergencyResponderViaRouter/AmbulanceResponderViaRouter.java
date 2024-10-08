package org.gofpatterns.chainOfResponsibility.emergencyResponderViaRouter;

import org.gofpatterns.chainOfResponsibility.EmergencyCall;

public class AmbulanceResponderViaRouter extends EmergencyResponderViaRouter {

    @Override
    public void responce(EmergencyCall emergencyCall) {
        System.out.printf("Ambulance responds to %s!\n", emergencyCall.getMessage());
    }
}
