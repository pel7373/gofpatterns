package org.gofpatterns.flyweight;

import org.gofpatterns.flyweight.unit.Infantry;
import org.gofpatterns.flyweight.unit.Tank;
import org.gofpatterns.flyweight.unit.Unit;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Unit tank1 = new Tank("tank1");
        Unit tank2 = new Tank("tank2");
        Unit infantry1 = new Infantry("infantry1");
        Unit infantry2 = new Infantry("infantry2");

        Unit.setCoordinates(1, 2);
        System.out.println(tank1);
        System.out.println(tank2);
        Unit.setCoordinates(3, 4);
        System.out.println(infantry1);
        System.out.println(infantry2);

        Unit.setCoordinates(5, 6);
        List<Unit> units = new ArrayList<>(List.of(tank1, tank2, infantry1, infantry2));
        System.out.println();
        System.out.println("=== List of all units: ===");
        units.stream().forEach(System.out::println);
    }
}