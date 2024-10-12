package org.gofpatterns.observer.service;

import org.gofpatterns.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StormInfoServiceImpl implements StormInfoService {
    private List<Observer> lowListObservers = new ArrayList<>();
    private List<Observer> mediumListObservers = new ArrayList<>();
    private List<Observer> highListObservers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer, StormLevel stormLevel) {
        switch (stormLevel) {
            case LOW -> lowListObservers.add(observer);
            case MEDIUM -> mediumListObservers.add(observer);
            case HIGH -> highListObservers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer, StormLevel stormLevel) {
        switch (stormLevel) {
            case LOW -> lowListObservers.remove(observer);
            case MEDIUM -> mediumListObservers.remove(observer);
            case HIGH -> highListObservers.remove(observer);
        }
    }

    public void sendLowNotification() {
        System.out.println("StormInfoService notifies about the LOW-level storm tomorrow!");
        lowListObservers.forEach(o -> o.notifyMe("StormInfoService notifies you about the LOW-level storm tomorrow!"));
    }

    public void sendMediumNotification() {
        System.out.println("StormInfoService notifies about the MEDIUM-level storm tomorrow!");
        mediumListObservers.forEach(o -> o.notifyMe("StormInfoService notifies you about the MEDIUM-level storm tomorrow!"));
    }

    public void sendHighNotification() {
        System.out.println("StormInfoService notifies about the HIGH-level storm tomorrow!");
        highListObservers.forEach(o -> o.notifyMe("StormInfoService notifies you about the HIGH-level storm tomorrow!"));
    }
}
