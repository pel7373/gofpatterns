package org.gofpatterns.observer.observer;

import org.gofpatterns.observer.service.StormLevel;

public interface Observer {
    void addToStormInfoService(StormLevel stormLevel);
    void removeFromStormInfoService(StormLevel stormLevel);
    void notifyMe(String message);
}
