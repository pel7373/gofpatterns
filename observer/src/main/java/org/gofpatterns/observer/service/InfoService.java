package org.gofpatterns.observer.service;

import org.gofpatterns.observer.observer.Observer;

public interface InfoService {
    void addObserver(Observer observer, Level level);
    void removeObserver(Observer observer, Level level);
    void sendLowLevelNotification(String messase);
    void sendMediumLevelNotification(String messase);
    void sendHighLevelNotification(String messase);
}
