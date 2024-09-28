package org.gofpatterns.flyweight.unit;

public class UnitCommon {
    private String texture;
    private String sound;

    public UnitCommon(String texture, String sound) {
        this.texture = texture;
        this.sound = sound;
    }

    public String getTexture() {
        return texture;
    }

    public String getSound() {
        return sound;
    }
}
