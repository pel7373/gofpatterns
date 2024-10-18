package org.gofpatterns.observer.service;

import org.gofpatterns.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StormInfoService implements InfoService<Level> {
    private final List<Observer> lowListObservers = new ArrayList<>();
    private final List<Observer> mediumListObservers = new ArrayList<>();
    private final List<Observer> highListObservers = new ArrayList<>();

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
    public void sendNotification(String message, Level level) {

        System.out.printf("StormInfoService notifies: %s!\n", message);
        switch (level) {
            case LOW -> lowListObservers.forEach(o -> o.onEvent(String.format("StormInfoService notifies: %s!\n", message)));
            case MEDIUM -> mediumListObservers.forEach(o -> o.onEvent(String.format("StormInfoService notifies: %s!\n", message)));
            case HIGH -> highListObservers.forEach(o -> o.onEvent(String.format("StormInfoService notifies: %s!\n", message)));
        }
    }
}
