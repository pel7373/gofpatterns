package org.gofpatterns.prototype.car;

import org.gofpatterns.prototype.exception.CreateCarException;

public class Car {
    private CarType carType;
    private String color;
    private String number;

    private Car(CarType carType) {
        this.carType = carType;
    }

    public static Car getCar(CarType carType) {
        switch (carType) {
            case CarType.CAR -> {
                return new Car(CarType.CAR);
            }

            case CarType.TRUCK -> {
                return new Car(CarType.TRUCK);
            }

            case CarType.MINIVAN -> {
                return new Car(CarType.MINIVAN);
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
