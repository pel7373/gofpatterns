package org.gofpatterns.mediator.service;

import org.gofpatterns.mediator.User;

public interface Service {
    default void takeCall(User user) {
        String answer = String.format("Dear %s, %s received your call! Thank you!", user.getName(), this.getClass().getSimpleName());
        user.notifyMe(answer);
    }
}
