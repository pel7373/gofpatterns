package org.gofpatterns.observer.observer;

import org.gofpatterns.observer.service.StormInfoService;
import org.gofpatterns.observer.service.StormLevel;

public class ObserverImpl implements Observer {
    private String name;
    private StormInfoService stormInfoService;

    public ObserverImpl(String name, StormInfoService stormInfoService) {
        this.name = name;
        this.stormInfoService = stormInfoService;
    }

    @Override
    public void notifyMe(String message) {
        System.out.printf("Me (%s) has been notified: %s", name, message);
    }

    @Override
    public void addToStormInfoService(StormLevel stormLevel) {
        stormInfoService.addObserver(this, stormLevel);
    }

    @Override
    public void removeFromStormInfoService(StormLevel stormLevel) {
        stormInfoService.removeObserver(this, stormLevel);
    }

    @Override
    public String toString() {
        return "ObserverImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
