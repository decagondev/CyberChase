package main.java.PhysicalAttributes;

import java.util.Random;

public enum Race {
    HUMAN,
    ELF,
    HALF_ELF,
    DWARF,
    HALFLING,
    GNOME;

    public static Race getRandomRace() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    //ToDo: Correct All Age, Weight, and Height values
    public int getRandomAge(Race race, Gender gender) {
        int max = 0;
        if (gender == Gender.Female) {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = Integer.MAX_VALUE;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            return new Random().nextInt((max - min + 1) + min);
        } else {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = Integer.MAX_VALUE;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            return new Random().nextInt((max - min + 1) + min);
        }
    }

    public double getRandomHeight(Race race, Gender gender) {
        int max = 0;
        if (gender == Gender.Female) {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = Integer.MAX_VALUE;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            Random random = new Random();
            return min + (max - min) * random.nextDouble();
        } else {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = Integer.MAX_VALUE;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            Random random = new Random();
            return min + (max - min) * random.nextDouble();
        }
    }

    public double getRandomWeight(Race race, Gender gender) {
        int max = 0;
        if (gender == Gender.Female) {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = Integer.MAX_VALUE;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            Random random = new Random();
            return min + (max - min) * random.nextDouble();
        } else {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = Integer.MAX_VALUE;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            Random random = new Random();
            return min + (max - min) * random.nextDouble();
        }
    }
}

