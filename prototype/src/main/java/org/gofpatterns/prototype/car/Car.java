package org.gofpatterns.prototype.car;

import org.gofpatterns.prototype.exception.CreateCarException;

public class Car implements Cloneable {
    private final CarType carType;
    private String color;
    private String number;

    private static final Car sedan = new Car(CarType.SEDAN);
    private static final Car truck = new Car(CarType.TRUCK);
    private static final Car minivan = new Car(CarType.MINIVAN);


    private Car(CarType carType) {
        this.carType = carType;
    }

    public static Car getCar(CarType carType) throws CloneNotSupportedException {
        switch (carType) {
            case CarType.SEDAN -> {
                return (Car) sedan.clone();
            }

            case CarType.TRUCK -> {
                return (Car) truck.clone();
            }

            case CarType.MINIVAN -> {
                return (Car) minivan.clone();
            }
        }
        throw new CreateCarException(String.format("Can't create car with type %s", carType.toString()));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", color='" + color + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
