package org.gofpatterns.prototype;

import org.gofpatterns.prototype.car.Car;
import org.gofpatterns.prototype.car.CarType;
import org.gofpatterns.prototype.exception.CreateCarException;

public class Main {
    public static void main(String[] args) {
        try{
            Car car = Car.getCar(CarType.SEDAN);
            car.setColor("Red");
            car.setNumber("AAAAA");
            System.out.println(car);

            Car car2 = Car.getCar(CarType.TRUCK);
            car2.setColor("Green");
            car2.setNumber("BBBBB");
            System.out.println(car2);

            Car car3 = Car.getCar(CarType.MINIVAN);
            car3.setColor("Yellow");
            car3.setNumber("CCCCC");
            System.out.println(car3);
        } catch (CreateCarException | CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}