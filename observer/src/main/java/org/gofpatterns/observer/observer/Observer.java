package org.gofpatterns.observer.observer;

import org.gofpatterns.observer.service.Level;

public interface Observer {
    void addToInfoService(Level level);
    void removeFromInfoService(Level level);
    void notifyMe(String message);
}
