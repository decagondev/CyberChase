package main.java;
import main.java.PhysicalAttributes.Race;

public class CharacterCreator {
    public static void main(String[] args) {
        Character character = Character.createRandomCharacter();
        int age = character.getPhysicalAttribute().getAge();
        double weight = character.getPhysicalAttribute().getWeight();
        double height = character.getPhysicalAttribute().getHeight();
        String race = character.getPhysicalAttribute().getRace().toString();


        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Race: " + race);
    }
}
