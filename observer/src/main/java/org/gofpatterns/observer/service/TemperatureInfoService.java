package org.gofpatterns.observer.service;

import org.gofpatterns.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureInfoService implements InfoService<Level> {
    private List<Observer> listObservers = new ArrayList<>();


    @Override
    public void addObserver(Observer observer, Level level) {
        listObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer, Level level) {
        listObservers.remove(observer);
    }

    @Override
    public void sendNotification(String messase, Level level) {
        System.out.printf("TemperatureInfoService notifies: %s!\n", messase);
        listObservers.forEach(o -> o.notifyMe(String.format("TemperatureInfoService notifies: %s!\n", messase)));
    }
}
