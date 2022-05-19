package main.java.PhysicalAttributes;

public class PhysicalAttribute {
    private Race race;
    private Gender gender;
    private SkinColor skin;
    private EyeColor eyeColor;
    private Hair hair;
    private int age;
    private double height;
    private double weight;

    public PhysicalAttribute(PhysicalAttributeBuilder builder) {
        this.race = builder.race;
        this.gender = builder.gender;
        this.skin = builder.skinColor;
        this.eyeColor = builder.eyeColor;
        this.hair = builder.hair;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public SkinColor getSkin() {
        return skin;
    }

    public void setSkin(SkinColor skin) {
        this.skin = skin;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(EyeColor eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Hair getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * A static method that constructs a random {@link PhysicalAttribute} and returns it
     * @return the new random PhysicalAttribute
     */
    public static PhysicalAttribute createRandomPhysicalAttribute() {
        Race race = Race.getRandomRace();
        Gender gender = Gender.getRandomGender();
        SkinColor skinColor = SkinColor.getRandomSkinColor();
        EyeColor eyeColor = EyeColor.getRandomEyeColor();
        // Calculate age, height and weight based on gender and race
        int age = race.getRandomAge(race, gender);
        double height = race.getRandomHeight(race, gender);
        double weight = race.getRandomWeight(race, gender);
//        Get random name and hair based on race and gender
        String name = Name.getRandomName(race, gender);
        Hair hair = Hair.getRandomHair(race, gender);

        return PhysicalAttribute.builder()
                .withRace(race)
                .withGender(gender)
                .withSkinColor(skinColor)
                .withEyeColor(eyeColor)
                .withHair(hair)
                .withAge(age)
                .withHeight(height)
                .withWeight(weight)
                .build();
    }

    public static PhysicalAttributeBuilder builder() {
        return new PhysicalAttributeBuilder();
    }

    public static class PhysicalAttributeBuilder {
        private Race race;
        private Gender gender;
        private SkinColor skinColor;
        private EyeColor eyeColor;
        private Hair hair;
        private int age;
        private double height;
        private double weight;

        public PhysicalAttributeBuilder withRace(Race race) {
            this.race = race;
            return this;
        }

        public PhysicalAttributeBuilder withGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public PhysicalAttributeBuilder withSkinColor(SkinColor skinColor) {
            this.skinColor = skinColor;
            return this;
        }

        public PhysicalAttributeBuilder withEyeColor(EyeColor eyeColor) {
            this.eyeColor = eyeColor;
            return this;
        }

        public PhysicalAttributeBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public PhysicalAttributeBuilder withHeight(double height) {
            this.height = height;
            return this;
        }

        public PhysicalAttributeBuilder withWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public PhysicalAttributeBuilder withHair(Hair hair) {
            this.hair = hair;
            return this;
        }

        public PhysicalAttribute build() {
            return new PhysicalAttribute(this);
        }
    }
}
