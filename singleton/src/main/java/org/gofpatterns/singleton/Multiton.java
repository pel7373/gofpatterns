package org.gofpatterns.singleton;

import org.gofpatterns.singleton.exception.IncorrectInstanceNumber;

public class Multiton {
    private final static int SIZE = 10;
    private static final Multiton[] instances = new Multiton[SIZE];
    private static int count = 0;

    private int myInstanceNumber;

    private Multiton () {}

    public static  Multiton getInstance() {
        return getInstance(0);
    }

    public static  Multiton getInstance(int instanceNumber) {
        if(instanceNumber < 0 || instanceNumber >= SIZE) {
            throw new IncorrectInstanceNumber(String.format("Instance number (%d) can't be < 0 and >= %d", instanceNumber, SIZE));
        }

        if(instances[instanceNumber] == null) {
            synchronized (Multiton.class) {
                if (instances[instanceNumber] == null) {
                    instances[instanceNumber] = new Multiton();
                    instances[instanceNumber].myInstanceNumber = instanceNumber;
                    count++;
                }
            }
        }

        return instances[instanceNumber];
    }

    public static int getCountInstances() {
        return count;
    }

    public int getMyInstanceNumber() {
        return myInstanceNumber;
    }
}
