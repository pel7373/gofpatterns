package org.gofpatterns.mediator.service;

public enum ServiceType {
    TAXI (TaxiService.class),
    REPAIRER (RepairerService.class),
    FLOWER_DELIVERY (FlowerDeliveryService.class);

    private final Class<? extends Service> clazz;

    ServiceType(Class<? extends Service> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends Service> getClazz() {
        return clazz;
    }
}
