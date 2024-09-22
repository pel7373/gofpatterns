package org.gofpatterns.singleton;

import org.gofpatterns.singleton.exception.IncorrectInstanceNumber;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Multiton multiton = Multiton.getInstance();
        System.out.println("#0: " + multiton + " : my number:" + multiton.getMyNumberOfInstances() + " : instances created:" + Multiton.getQuantityOfCreatedInstances());

        for (int i = 1; i < 10; i++) {
            multiton = Multiton.getInstance(i);
            System.out.println("#" + i + ": " + multiton + " : my number:" + multiton.getMyNumberOfInstances() + " : instances created:" + Multiton.getQuantityOfCreatedInstances());
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            multiton = Multiton.getInstance(i);
            System.out.println("#" + i + ": " + multiton + " : my number:" + multiton.getMyNumberOfInstances() + " : instances created:" + Multiton.getQuantityOfCreatedInstances());
        }

        System.out.println();
        try{
            multiton = Multiton.getInstance(11);
            System.out.println("#11: " + multiton + " : my number:" + multiton.getMyNumberOfInstances()  + " : instances created:" + Multiton.getQuantityOfCreatedInstances());
        }  catch (IncorrectInstanceNumber e) {
            System.out.println(e.getMessage());
        }
    }
}