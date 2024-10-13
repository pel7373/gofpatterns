package org.gofpatterns.observer;

import org.gofpatterns.observer.observer.Observer;
import org.gofpatterns.observer.observer.ObserverImpl;
import org.gofpatterns.observer.service.InfoService;
import org.gofpatterns.observer.service.StormInfoServiceImpl;
import org.gofpatterns.observer.service.Level;

public class Main {
    public static void main(String[] args) {
        InfoService stormInfoService = new StormInfoServiceImpl();
        Observer schoolObserver = new ObserverImpl("school", stormInfoService);
        Observer airportObserver = new ObserverImpl("airport", stormInfoService);
        Observer roadServiceObserver = new ObserverImpl("roadService", stormInfoService);

        schoolObserver.addToInfoService(Level.LOW);
        schoolObserver.addToInfoService(Level.MEDIUM);
        airportObserver.addToInfoService(Level.MEDIUM);
        roadServiceObserver.addToInfoService(Level.HIGH);


        System.out.println();
        stormInfoService.sendLowLevelNotification("THE DAY AFTER TOMORROW is expected the LOW-level storm!");
        System.out.println();
        stormInfoService.sendMediumLevelNotification("IN 2 HOURS is expected the MEDIUM-level storm!");
        System.out.println();
        stormInfoService.sendHighLevelNotification("TOMORROW is expected the HIGH-level storm!");

        schoolObserver.removeFromInfoService(Level.LOW);
        airportObserver.removeFromInfoService(Level.MEDIUM);
        roadServiceObserver.removeFromInfoService(Level.HIGH);

        System.out.println();
        stormInfoService.sendLowLevelNotification("THE DAY AFTER TOMORROW is expected the LOW-level storm!");
        System.out.println();
        stormInfoService.sendMediumLevelNotification("IN 2 HOURS is expected the MEDIUM-level storm!");
        System.out.println();
        stormInfoService.sendHighLevelNotification("TOMORROW is expected the HIGH-level storm!");
    }
}