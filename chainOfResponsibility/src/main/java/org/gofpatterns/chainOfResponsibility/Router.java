package org.gofpatterns.chainOfResponsibility;

import org.gofpatterns.chainOfResponsibility.emergencyResponderViaRouter.AmbulanceResponderViaRouter;
import org.gofpatterns.chainOfResponsibility.emergencyResponderViaRouter.EmergencyResponderViaRouter;
import org.gofpatterns.chainOfResponsibility.emergencyResponderViaRouter.FireFighterResponderViaRouter;
import org.gofpatterns.chainOfResponsibility.emergencyResponderViaRouter.PoliceResponderViaRouter;

public class Router {

    public EmergencyResponderViaRouter getRouteForRobbery() {
        return new PoliceResponderViaRouter();
    }

    public EmergencyResponderViaRouter getRouteForFire() {
        EmergencyResponderViaRouter firstResponderViaRouter = new PoliceResponderViaRouter();
        EmergencyResponderViaRouter fireFightersViaRouter = new FireFighterResponderViaRouter();
        EmergencyResponderViaRouter ambulanceViaRouter = new AmbulanceResponderViaRouter();
        firstResponderViaRouter.setNextEmergencyResponder(fireFightersViaRouter);
        fireFightersViaRouter.setNextEmergencyResponder(ambulanceViaRouter);
        return firstResponderViaRouter;
    }

    public EmergencyResponderViaRouter getRouteForShooting() {
        EmergencyResponderViaRouter firstResponderViaRouter = new PoliceResponderViaRouter();
        EmergencyResponderViaRouter ambulanceViaRouter = new AmbulanceResponderViaRouter();
        firstResponderViaRouter.setNextEmergencyResponder(ambulanceViaRouter);
        return firstResponderViaRouter;
    }

    public EmergencyResponderViaRouter getRouteForFraud() {
        return new PoliceResponderViaRouter();
    }
}
