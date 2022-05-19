package main.java.BackgroundAttributes;

import java.util.Random;

public enum Alignment {
        LAWFUL_GOOD,
        NEUTRAL_GOOD,
        CHAOTIC_GOOD,
        LAWFUL_NEUTRAL,
        TRUE_NEUTRAL,
        CHAOTIC_NEUTRAL,
        LAWFUL_EVIL,
        NEUTRAL_EVIL,
        CHAOTIC_EVIL;

    public static Alignment getRandomAlignment() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
