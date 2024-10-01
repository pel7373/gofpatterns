package org.gofpatterns.flyweight.unit;

public class Tank extends Unit {

    public Tank(String title) {
        super(title);
    }

    private static UnitCommon tankCommon = new UnitCommon("TankTexture", "TankSound");

    @Override
    public String getTexture() {
        return tankCommon.getTexture();
    }

    @Override
    public String getSound() {
        return tankCommon.getSound();
    }
}
