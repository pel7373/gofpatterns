package org.gofpatterns.singleton;

import org.gofpatterns.singleton.exception.IncorrectInstanceNumber;

public class Multiton {
    private final static int MAX_INSTANCES = 10;
    private static Multiton[] arrayOfInstances = new Multiton[MAX_INSTANCES];
    private static int quantityOfCreatedInstances = 0;

    private int myNumberOfInstances;

    private Multiton () {}

    public static  Multiton getInstance() {
        return getInstance(0);
    }

    public static  Multiton getInstance(int instanceNumber) {
        if(instanceNumber < 0 || instanceNumber >= MAX_INSTANCES) {
            throw new IncorrectInstanceNumber(String.format("Instance number (%d) can't be < 0 and >= %d", instanceNumber, MAX_INSTANCES));
        }

        synchronized (Multiton.class) {
            if(arrayOfInstances[instanceNumber] == null) {
                arrayOfInstances[instanceNumber] = new Multiton();
                arrayOfInstances[instanceNumber].myNumberOfInstances = instanceNumber;
                quantityOfCreatedInstances++;
            }
        }

        return arrayOfInstances[instanceNumber];
    }

    public static int getQuantityOfCreatedInstances() {
        return quantityOfCreatedInstances;
    }

    public int getMyNumberOfInstances() {
        return myNumberOfInstances;
    }
}
