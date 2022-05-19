package main.java.BackgroundAttributes;

public class BackgroundAttribute {
    private FamilyHistory familyHistory;
    private Talents talents;
    private Flaws flaws;

    public BackgroundAttribute(BackgroundAttributeBuilder builder) {
        this.familyHistory = builder.familyHistory;
        this.talents = builder.talents;
        this.flaws = builder.flaws;
    }

    /**
     * A static method that constructs a random {@link BackgroundAttribute} and returns it
     * @return the new random BackgroundAttribute
     */
    public static BackgroundAttribute createRandomBackgroundAttribute() {
        FamilyHistory familyHistory = FamilyHistory.getRandomFamilyHistory();
        Talents talents = Talents.getRandomTalents();
        Flaws flaws = Flaws.getRandomFlaws();

        return BackgroundAttribute.builder()
                .withFamilyHistory(familyHistory)
                .withTalents(talents)
                .withFlaws(flaws)
                .build();
    }

    public static BackgroundAttributeBuilder builder() {
        return new BackgroundAttributeBuilder();
    }

    public static class BackgroundAttributeBuilder {
        private FamilyHistory familyHistory;
        private Talents talents;
        private Flaws flaws;

        public BackgroundAttributeBuilder withFamilyHistory(FamilyHistory familyHistory) {
            this.familyHistory = familyHistory;
            return this;
        }

        public BackgroundAttributeBuilder withTalents(Talents talents) {
            this.talents = talents;
            return this;
        }

        public BackgroundAttributeBuilder withFlaws(Flaws flaws) {
            this.flaws = flaws;
            return this;
        }

        public BackgroundAttribute build() {
            return new BackgroundAttribute(this);
        }
    }
}
