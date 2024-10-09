package org.gofpatterns.chainOfResponsibility.emergencyResponderViaRouter;

import org.gofpatterns.chainOfResponsibility.EmergencyCall;

public class PoliceResponderViaRouter extends EmergencyResponderViaRouter {

    @Override
    public void responce(EmergencyCall emergencyCall) {
        System.out.printf("Police responds to %s!\n", emergencyCall.getMessage());
    }
}
