package org.gofpatterns.observer.service;

import org.gofpatterns.observer.observer.Observer;

public interface InfoService<T> {
    void addObserver(Observer observer, T t);
    void removeObserver(Observer observer, T t);
    void sendNotification(String message, T t);
}
