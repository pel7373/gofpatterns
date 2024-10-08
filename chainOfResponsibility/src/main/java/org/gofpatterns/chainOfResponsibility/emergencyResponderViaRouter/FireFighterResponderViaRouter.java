package org.gofpatterns.chainOfResponsibility.emergencyResponderViaRouter;

import org.gofpatterns.chainOfResponsibility.EmergencyCall;

public class FireFighterResponderViaRouter extends EmergencyResponderViaRouter {

    @Override
    public void responce(EmergencyCall emergencyCall) {
        System.out.printf("FireFigters responds to %s!\n", emergencyCall.getMessage());
    }
}
