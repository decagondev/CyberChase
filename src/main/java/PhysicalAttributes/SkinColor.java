package main.java.PhysicalAttributes;

import java.util.Random;

public enum SkinColor {
        BLACK,
        WHITE,
        BROWN,
        TAN,
        ALBINO,
        PALE,
        BLUE_WHITE;

    public static SkinColor getRandomSkinColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
