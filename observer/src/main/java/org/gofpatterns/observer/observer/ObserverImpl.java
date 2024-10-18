package org.gofpatterns.observer.observer;

import org.gofpatterns.observer.service.InfoService;
import org.gofpatterns.observer.service.Level;

public class ObserverImpl implements Observer {
    private final String name;
    private final InfoService<Level> infoService;

    public ObserverImpl(String name, InfoService<Level> infoService) {
        this.name = name;
        this.infoService = infoService;
    }

    @Override
    public void onEvent(String message) {
        System.out.printf("Me (%s) has been notified: %s", name, message);
    }

    @Override
    public void addToInfoService(Level level) {
        infoService.addObserver(this, level);
    }

    @Override
    public void removeFromInfoService(Level level) {
        infoService.removeObserver(this, level);
    }

    @Override
    public String toString() {
        return "ObserverImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
