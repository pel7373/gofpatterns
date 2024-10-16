package org.gofpatterns.mediator.mediator;

import org.gofpatterns.mediator.User;
import org.gofpatterns.mediator.service.ServiceType;
import org.gofpatterns.mediator.service.Service;

import java.lang.reflect.InvocationTargetException;

public class MediatorImpl implements Mediator {
    int callID = 0;
    Mediator mediator = this;
    @Override
    public void callService(ServiceType serviceType, User user) {
        SendCall sendCall = new SendCall(serviceType, user, callID);
        new Thread(sendCall).start();
        callID++;
    }

    @Override
    public void replyToUser(Service service, User user, String message) {
        String answer = String.format("From MediatorImpl: Dear %s, %s reports: %s",
                user.getName(), service.getClass().getSimpleName(), message);
        user.notifyMe(answer);
    }

    class SendCall implements Runnable {
        ServiceType serviceType;
        User user;
        int callID;

        public SendCall(ServiceType serviceType, User user, int callID) {
            this.serviceType = serviceType;
            this.user = user;
            this.callID = callID;
        }

        public void run() {
            String answer = String.format("Dear %s, MediatorImpl is sending your request #%d to %s", user.getName(), callID, serviceType.getClazz().getSimpleName());
            user.notifyMe(answer);
            try {
                serviceType.getClazz().getDeclaredConstructor().newInstance().takeCall(user, mediator, callID);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException  | NoSuchMethodException e) {
                answer = String.format("Dear %s, MediatorImpl can't send your request #%d to %s", user.getName(), callID, serviceType.getClazz().getSimpleName());
                System.out.println(answer);
            }
        }
    }


}
