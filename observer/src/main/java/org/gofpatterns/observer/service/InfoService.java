package org.gofpatterns.observer.service;

import org.gofpatterns.observer.observer.Observer;

public interface InfoService {
    void addObserver(Observer observer, Level level);
    void removeObserver(Observer observer, Level level);
    void sendNotification(String messase, Level level);
}
