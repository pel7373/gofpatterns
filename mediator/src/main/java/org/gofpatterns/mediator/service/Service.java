package org.gofpatterns.mediator.service;

import org.gofpatterns.mediator.User;
import org.gofpatterns.mediator.mediator.Mediator;

public interface Service {
    void takeCall(User user, Mediator mediator, int callID);
}
