package main.java.PhysicalAttributes;

import java.util.Random;

public enum EyeColor {
//    HETEROCHROMIA,
    AMBER,
    BLUE,
    BROWN,
    GRAY,
    GREEN,
    HAZEL,
    RED,
    VIOLET,
    BLACK,
    BLIND;

    public static EyeColor getRandomEyeColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
