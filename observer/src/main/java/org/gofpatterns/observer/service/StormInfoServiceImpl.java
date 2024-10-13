package org.gofpatterns.observer.service;

import org.gofpatterns.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StormInfoServiceImpl implements InfoService {
    private List<Observer> lowListObservers = new ArrayList<>();
    private List<Observer> mediumListObservers = new ArrayList<>();
    private List<Observer> highListObservers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer, Level level) {
        switch (level) {
            case LOW -> lowListObservers.add(observer);
            case MEDIUM -> mediumListObservers.add(observer);
            case HIGH -> highListObservers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer, Level level) {
        switch (level) {
            case LOW -> lowListObservers.remove(observer);
            case MEDIUM -> mediumListObservers.remove(observer);
            case HIGH -> highListObservers.remove(observer);
        }
    }

    @Override
    public void sendLowLevelNotification(String messase) {
        System.out.printf("StormInfoService notifies: %s!\n", messase);
        lowListObservers.forEach(o -> o.notifyMe(String.format("StormInfoService notifies: %s!\n", messase)));
    }

    @Override
    public void sendMediumLevelNotification(String messase) {
        System.out.printf("StormInfoService notifies: %s!\n", messase);
        mediumListObservers.forEach(o -> o.notifyMe(String.format("StormInfoService notifies: %s!\n", messase)));
    }

    @Override
    public void sendHighLevelNotification(String messase) {
        System.out.printf("StormInfoService notifies: %s!\n", messase);
        highListObservers.forEach(o -> o.notifyMe(String.format("StormInfoService notifies: %s!\n", messase)));
    }
}
