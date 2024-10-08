package org.gofpatterns.chainOfResponsibility.emergencyResponder;

import org.gofpatterns.chainOfResponsibility.EmergencyCall;
import org.gofpatterns.chainOfResponsibility.config.Config;

public class FireFighterResponder extends EmergencyResponder {
    public FireFighterResponder() {
        accidentSet = Config.FIREFIGHTER_ACCIDENT_SET;
    }

    @Override
    public void responce(EmergencyCall emergencyCall) {
        System.out.printf("FireFigters responds to %s!\n", emergencyCall.getMessage());
    }
}
