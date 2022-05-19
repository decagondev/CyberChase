package main.java;
import main.java.BackgroundAttributes.BackgroundAttribute;
import main.java.PhysicalAttributes.PhysicalAttribute;

//ToDo: DynamoDb Mapping
public class Character {
    private PhysicalAttribute physicalAttribute;
    private BackgroundAttribute backgroundAttribute;

    public Character(PhysicalAttribute physicalAttribute, BackgroundAttribute backgroundAttribute) {
        this.physicalAttribute = physicalAttribute;
        this.backgroundAttribute = backgroundAttribute;
    }

    public PhysicalAttribute getPhysicalAttribute() {
        return physicalAttribute;
    }

    public void setPhysicalAttribute(PhysicalAttribute physicalAttribute) {
        this.physicalAttribute = physicalAttribute;
    }

    public BackgroundAttribute getBackgroundAttribute() {
        return backgroundAttribute;
    }

    public void setBackgroundAttribute(BackgroundAttribute backgroundAttribute) {
        this.backgroundAttribute = backgroundAttribute;
    }

    public static Character createRandomCharacter() {
        PhysicalAttribute physicalAttribute = PhysicalAttribute.createRandomPhysicalAttribute();
        BackgroundAttribute backgroundAttribute = BackgroundAttribute.createRandomBackgroundAttribute();
        return new Character(physicalAttribute, backgroundAttribute);
    }
}
