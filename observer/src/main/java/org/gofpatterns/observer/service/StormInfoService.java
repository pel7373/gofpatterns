package org.gofpatterns.observer.service;

import org.gofpatterns.observer.observer.Observer;

public interface StormInfoService {
    void addObserver(Observer observer, StormLevel stormLevel);
    void removeObserver(Observer observer, StormLevel stormLevel);
    void sendLowNotification();
    void sendMediumNotification();
    void sendHighNotification();
}
