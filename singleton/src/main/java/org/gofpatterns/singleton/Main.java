package org.gofpatterns.singleton;

import org.gofpatterns.singleton.exception.IncorrectInstanceNumber;

public class Main {
    public static void main(String[] args) {
        Multiton multiton = Multiton.getInstance();
        System.out.println("#0: " + multiton + " : my number:" + multiton.getMyInstanceNumber() + " : instances created:" + Multiton.getCountInstances());

        for (int i = 1; i < 10; i++) {
            multiton = Multiton.getInstance(i);
            System.out.println("#" + i + ": " + multiton + " : my number:" + multiton.getMyInstanceNumber() + " : instances created:" + Multiton.getCountInstances());
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            multiton = Multiton.getInstance(i);
            System.out.println("#" + i + ": " + multiton + " : my number:" + multiton.getMyInstanceNumber() + " : instances created:" + Multiton.getCountInstances());
        }

        System.out.println();
        try{
            multiton = Multiton.getInstance(11);
            System.out.println("#11: " + multiton + " : my number:" + multiton.getMyInstanceNumber()  + " : instances created:" + Multiton.getCountInstances());
        }  catch (IncorrectInstanceNumber e) {
            System.out.println(e.getMessage());
        }
    }
}