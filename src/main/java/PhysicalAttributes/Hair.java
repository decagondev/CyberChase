package main.java.PhysicalAttributes;

public class Hair {
    HairColor hairColor;
    HairStyle hairStyle;

    public Hair(HairColor hairColor, HairStyle hairStyle) {
        this.hairColor = hairColor;
        this.hairStyle = hairStyle;
    }

    //ToDo: Find an elegant way to get hair based on race and gender
    public static Hair getRandomHair(Race race, Gender gender) {
        HairColor hairColor = HairColor.getRandomHairColor();
        HairStyle hairStyle = HairStyle.getRandomHairStyle();
        return new Hair(hairColor, hairStyle);
    }
}
