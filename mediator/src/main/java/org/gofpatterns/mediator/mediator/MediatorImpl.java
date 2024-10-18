package org.gofpatterns.mediator.mediator;

import org.gofpatterns.mediator.User;
import org.gofpatterns.mediator.service.ServiceType;

import static org.gofpatterns.mediator.config.Config.serviceMap;

public class MediatorImpl implements Mediator {
    @Override
    public void callService(ServiceType serviceType, User user) {
        serviceMap.get(serviceType).takeCall(user);
        String answer = String.format("Dear %s, MediatorImpl sent your call to %s", user.getName(), serviceMap.get(serviceType).getClass().getSimpleName());
        user.notifyMe(answer);
    }
}
