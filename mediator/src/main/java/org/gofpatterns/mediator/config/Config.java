package org.gofpatterns.mediator.config;

import org.gofpatterns.mediator.service.*;

import java.util.HashMap;
import java.util.Map;

public class Config {
    public static Map<ServiceType, Service> serviceMap = new HashMap<>();
    static {
        serviceMap.put(ServiceType.TAXI, new TaxiService());
        serviceMap.put(ServiceType.REPAIRER, new RepairerService());
        serviceMap.put(ServiceType.FLOWER_DELIVERY, new FlowerDeliveryService());
    }
}
