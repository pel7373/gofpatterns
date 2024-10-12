package org.gofpatterns.observer;

import org.gofpatterns.observer.observer.Observer;
import org.gofpatterns.observer.observer.ObserverImpl;
import org.gofpatterns.observer.service.StormInfoService;
import org.gofpatterns.observer.service.StormInfoServiceImpl;
import org.gofpatterns.observer.service.StormLevel;

public class Main {
    public static void main(String[] args) {
        StormInfoService stormInfoService = new StormInfoServiceImpl();
        Observer schoolObserver = new ObserverImpl("school", stormInfoService);
        Observer airportObserver = new ObserverImpl("airport", stormInfoService);
        Observer roadServiceObserver = new ObserverImpl("roadService", stormInfoService);

        schoolObserver.addToStormInfoService(StormLevel.LOW);
        airportObserver.addToStormInfoService(StormLevel.MEDIUM);
        roadServiceObserver.addToStormInfoService(StormLevel.HIGH);


        System.out.println();
        stormInfoService.sendLowNotification();
        System.out.println();
        stormInfoService.sendMediumNotification();
        System.out.println();
        stormInfoService.sendHighNotification();

        schoolObserver.removeFromStormInfoService(StormLevel.LOW);
        airportObserver.removeFromStormInfoService(StormLevel.MEDIUM);
        roadServiceObserver.removeFromStormInfoService(StormLevel.HIGH);

        System.out.println();
        stormInfoService.sendLowNotification();
        System.out.println();
        stormInfoService.sendMediumNotification();
        System.out.println();
        stormInfoService.sendHighNotification();
    }
}