package org.gofpatterns.chainOfResponsibility;

import org.gofpatterns.chainOfResponsibility.emergencyResponder.AmbulanceResponder;
import org.gofpatterns.chainOfResponsibility.emergencyResponder.EmergencyResponder;
import org.gofpatterns.chainOfResponsibility.emergencyResponder.FireFighterResponder;
import org.gofpatterns.chainOfResponsibility.emergencyResponder.PoliceResponder;
import org.gofpatterns.chainOfResponsibility.exception.InvalidEmergencyCallException;

public class Main {
    public static void main(String[] args) {
        EmergencyResponder firstResponder = new PoliceResponder();
        EmergencyResponder fireFighters = new FireFighterResponder();
        EmergencyResponder ambulance = new AmbulanceResponder();
        firstResponder.setNextEmergencyResponder(fireFighters);
        fireFighters.setNextEmergencyResponder(ambulance);

        try {
            firstResponder.handler(new EmergencyCall("Robbery"));

            System.out.println();
            firstResponder.handler(new EmergencyCall("Fire"));

            System.out.println();
            firstResponder.handler(new EmergencyCall("Shooting"));

            System.out.println();
            firstResponder.handler(new EmergencyCall("Fraud"));
        } catch (InvalidEmergencyCallException e) {
            System.out.println(e.getMessage());
        }



    }
}
