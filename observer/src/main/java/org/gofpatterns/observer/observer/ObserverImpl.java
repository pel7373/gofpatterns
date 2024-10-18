package org.gofpatterns.observer.observer;

import org.gofpatterns.observer.service.InfoService;
import org.gofpatterns.observer.service.Level;

public class ObserverImpl implements Observer {
    private String name;
    private InfoService stormInfoService;

    public ObserverImpl(String name, InfoService stormInfoService) {
        this.name = name;
        this.stormInfoService = stormInfoService;
    }

    @Override
    public void notifyMe(String message) {
        System.out.printf("Me (%s) has been notified: %s", name, message);
    }

    @Override
    public void addToInfoService(Level level) {
        stormInfoService.addObserver(this, level);
    }

    @Override
    public void removeFromInfoService(Level level) {
        stormInfoService.removeObserver(this, level);
    }

    @Override
    public String toString() {
        return "ObserverImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
