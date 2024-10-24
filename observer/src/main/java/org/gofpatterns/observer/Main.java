package org.gofpatterns.observer;

import org.gofpatterns.observer.observer.Observer;
import org.gofpatterns.observer.observer.ObserverImpl;
import org.gofpatterns.observer.service.InfoService;
import org.gofpatterns.observer.service.StormInfoService;
import org.gofpatterns.observer.service.Level;
import org.gofpatterns.observer.service.TemperatureInfoService;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== StormInfoService ====");
        InfoService<Level> stormInfoService = new StormInfoService();
        Observer schoolObserver = new ObserverImpl("school", stormInfoService);
        Observer airportObserver = new ObserverImpl("airport", stormInfoService);
        Observer roadServiceObserver = new ObserverImpl("roadService", stormInfoService);

        schoolObserver.addToInfoService(Level.LOW);
        schoolObserver.addToInfoService(Level.MEDIUM);
        airportObserver.addToInfoService(Level.MEDIUM);
        roadServiceObserver.addToInfoService(Level.HIGH);


        System.out.println();
        stormInfoService.sendNotification("THE DAY AFTER TOMORROW is expected the LOW-level storm", Level.LOW);
        System.out.println();
        stormInfoService.sendNotification("IN 2 HOURS is expected the MEDIUM-level storm", Level.MEDIUM);
        System.out.println();
        stormInfoService.sendNotification("TOMORROW is expected the HIGH-level storm", Level.HIGH);

        schoolObserver.removeFromInfoService(Level.LOW);
        airportObserver.removeFromInfoService(Level.MEDIUM);
        roadServiceObserver.removeFromInfoService(Level.HIGH);

        System.out.println();
        stormInfoService.sendNotification("THE DAY AFTER TOMORROW is expected the LOW-level storm", Level.LOW);
        System.out.println();
        stormInfoService.sendNotification("IN 2 HOURS is expected the MEDIUM-level storm", Level.MEDIUM);
        System.out.println();
        stormInfoService.sendNotification("TOMORROW is expected the HIGH-level storm", Level.HIGH);

        System.out.println();
        System.out.println("==== TemperatureInfoService ====");
        InfoService<Level> temperatureInfoService = new TemperatureInfoService();
        schoolObserver = new ObserverImpl("school", temperatureInfoService);
        airportObserver = new ObserverImpl("airport", temperatureInfoService);
        roadServiceObserver = new ObserverImpl("roadService", temperatureInfoService);

        schoolObserver.addToInfoService(Level.LOW);
        airportObserver.addToInfoService(Level.MEDIUM);
        roadServiceObserver.addToInfoService(Level.HIGH);


        System.out.println();
        temperatureInfoService.sendNotification("IN 1 HOURS is expected 35°C", Level.LOW);
        System.out.println();
        temperatureInfoService.sendNotification("IN 3 HOURS is expected 30°C", Level.MEDIUM);
        System.out.println();
        temperatureInfoService.sendNotification("IN 6 HOURS is expected 25°C", Level.HIGH);

    }
}