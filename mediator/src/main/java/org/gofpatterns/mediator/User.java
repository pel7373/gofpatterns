package org.gofpatterns.mediator;

import org.gofpatterns.mediator.mediator.Mediator;
import org.gofpatterns.mediator.service.ServiceType;

public class User {
    private String name;
    private String address;
    private Mediator mediator;

    public User(String name, String address, Mediator mediator) {
        this.name = name;
        this.address = address;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void callService(ServiceType serviceType) {
        mediator.callService(serviceType, this);
    }

    public void notifyMe(String message) {
        //System.out.println(message);
        System.out.printf("User %s have been notified: \"%s\"\n", name, message);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
