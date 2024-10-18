package org.gofpatterns.mediator.service;

public enum ServiceType {
    TAXI (new TaxiService()),
    REPAIRER (new RepairerService()),
    FLOWER_DELIVERY (new FlowerDeliveryService());

    private final Service service;

    ServiceType(Service service) {
        this.service = service;
    }

    public Service getService() {
        return service;
    }
}
