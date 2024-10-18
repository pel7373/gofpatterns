package org.gofpatterns.mediator.service;

import org.gofpatterns.mediator.User;
import org.gofpatterns.mediator.mediator.Mediator;

public abstract class AbstractService implements Service {
    protected AbstractService service;

    public void takeCall(User user, Mediator mediator, int callID) {
        Executor executor = new Executor(user, mediator, callID);
        new Thread(executor).start();
    }

    private void doTheWork() {
        int durationOfWorkExecution = (int) (Math.random() * 3000);
        try {
            Thread.sleep(durationOfWorkExecution);
        } catch (InterruptedException ignored) {
        }
    }

    class Executor implements Runnable {

        Mediator mediator;
        User user;
        int callID;

        public Executor(User user, Mediator mediator, int callID) {
            this.mediator = mediator;
            this.user = user;
            this.callID = callID;
        }

        public void run() {
            String answer = String.format("Dear %s, %s has received your request #%d and has started to execute it! Thank you!", user.getName(), service.getClass().getSimpleName(), callID);
            mediator.replyToUser(service, user, answer);
            doTheWork();
            answer = String.format("Dear %s, %s has completed your request #%d! Thank you!", user.getName(), service.getClass().getSimpleName(), callID);
            mediator.replyToUser(service, user, answer);
        }
    }
}
