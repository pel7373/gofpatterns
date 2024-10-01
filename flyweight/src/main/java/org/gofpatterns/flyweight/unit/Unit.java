package org.gofpatterns.flyweight.unit;

public abstract class Unit {

    protected String title;

    public Unit(String title) {
        this.title = title;
    }

    public final static int getCoordinatesX() {
        return Coordinates.getX();
    }

    public final int getCoordinatesY() {
        return Coordinates.getY();
    }

    public static void setCoordinates(int x, int y) {
        Coordinates.setCoordinates(x, y);
    }

    public abstract String getTexture();

    public abstract String getSound();

    @Override
    public String toString() {
        return title +  " {" +
                "x: " + getCoordinatesX() +
                "; y: " + getCoordinatesY() +
                "; texture: " + this.getTexture() +
                "; sound: " + this.getSound() +
                '}';
    }

    public class Coordinates {
        private static int x;
        private static int y;

        public static int getX() {
            return x;
        }

        public static void setX(int x) {
            Coordinates.x = x;
        }

        public static int getY() {
            return y;
        }

        public static void setY(int y) {
            Coordinates.y = y;
        }

        public static void setCoordinates(int x, int y) {
            Coordinates.x = x;
            Coordinates.y = y;
        }
    }

}
