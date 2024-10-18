package org.gofpatterns.mediator.mediator;

import org.gofpatterns.mediator.User;
import org.gofpatterns.mediator.service.Service;
import org.gofpatterns.mediator.service.ServiceType;

public class MediatorImpl implements Mediator {
    int callID = 0;

    @Override
    public void callService(ServiceType serviceType, User user) {
        String answer = String.format("Dear %s, MediatorImpl is sending your request #%d to %s", user.getName(), callID, serviceType.getService().getClass().getSimpleName());
        user.notifyMe(answer);
        serviceType.getService().takeCall(user, this, callID);
        callID++;
    }

    @Override
    public void replyToUser(Service service, User user, String message) {
        String answer = String.format("From MediatorImpl: Dear %s, %s reports: %s",
                user.getName(), service.getClass().getSimpleName(), message);
        user.notifyMe(answer);
    }
}
