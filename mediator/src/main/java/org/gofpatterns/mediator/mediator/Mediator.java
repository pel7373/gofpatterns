package org.gofpatterns.mediator.mediator;

import org.gofpatterns.mediator.User;
import org.gofpatterns.mediator.service.ServiceType;

public interface Mediator {
    void callService(ServiceType serviceType, User user);
}
