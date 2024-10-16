package org.gofpatterns.mediator.service;

import org.gofpatterns.mediator.User;
import org.gofpatterns.mediator.mediator.Mediator;

public abstract class Service  {

    public void takeCall(User user, Mediator mediator, int callID) {
        String answer = String.format("Dear %s, %s received your request #%d! Thank you!", user.getName(), this.getClass().getSimpleName(), callID);
        mediator.replyToUser(this, user, answer);
        doTheWork();
        answer = String.format("Dear %s, %s has completed your request #%d! Thank you!", user.getName(), this.getClass().getSimpleName(), callID);
        mediator.replyToUser(this, user, answer);
    }

    private void doTheWork() {
        int durationOfWorkExecution = (int) (Math.random() * 3000);
        try {
            Thread.sleep(durationOfWorkExecution);
        } catch (InterruptedException ignored) {
        }
    }
    
}
