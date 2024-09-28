package org.gofpatterns.flyweight.unit;

public class Infantry extends Unit {
    public Infantry(String title) {
        super(title);
    }

    private static UnitCommon infantryCommon = new UnitCommon("InfantryTexture", "InfantrySound");

    @Override
    public String getTexture() {
        return infantryCommon.getTexture();
    }

    @Override
    public String getSound() {
        return infantryCommon.getSound();
    }
}