package main.java.PhysicalAttributes;

import java.util.Random;

public enum HairColor {
    RED,
    BLACK,
    BLONDE,
    BRUNETTE,
    STRAWBERRY_BLONDE,
    BLUE,
    GREEN,
    YELLOW,
    PURPLE,
    WHITE,
    GREY;

    public static HairColor getRandomHairColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
