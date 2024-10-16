package org.gofpatterns.mediator;

import org.gofpatterns.mediator.mediator.Mediator;
import org.gofpatterns.mediator.mediator.MediatorImpl;
import org.gofpatterns.mediator.service.ServiceType;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();

        User user1 = new User("Paul", "Yanhelya str., 55", mediator);
        User user2 = new User("Maria", "Soborna str., 33", mediator);
        User user3 = new User("Sergey", "Keletska str., 44", mediator);

        user1.callService(ServiceType.TAXI);
        user2.callService(ServiceType.REPAIRER);
        user3.callService(ServiceType.FLOWER_DELIVERY);

        user1.callService(ServiceType.FLOWER_DELIVERY);
        user2.callService(ServiceType.TAXI);
        user3.callService(ServiceType.REPAIRER);
    }
}