package DNDGenerator;  // This declares that this class belongs to the DNDGenerator package.

import DNDGenerator.Names;      // Import the Names class from the DNDGenerator package.
import DNDGenerator.Equipment;  // Import the Equipment class from the DNDGenerator package.

import java.util.Random;  // Import the Random class to generate random values.

public class NPC {  // Define the NPC class (blueprint for creating NPC objects).

    // 🔹 **Instance Variables (Attributes)**
    private String name;      // The NPC's name (retrieved from the Names class).
    private String gender;    // The NPC's gender (Male, Female, or Non-binary).
    private String ageGroup;  // The NPC's age category (Young, Middle-aged, Old, Ancient).
    private String race;      // The NPC's race (Human, Elf, Dwarf, Orc, Tiefling).
    private String profession; // The NPC's profession or class (e.g., Wizard, Warrior).
    private String equipment; // The NPC's assigned equipment (retrieved from the Equipment class).

    // 🔹 **Static Arrays for Random Selection**
    private static String[] genders = {"Male", "Female", "Non-binary"};
    private static String[] ageGroups = {"Young", "Middle-aged", "Old", "Ancient"};
    private static final String[] races = {
        "Human", "Dwarf", "Elf", "Orc", "Dragonborn", "Tiefling", "Halfling", "Gnome"
    };

    private static String[] professions = {"Blacksmith", "Wizard", "Thief", "Bard", "Cleric", "Warrior", "Merchant"};

    private static Random rand = new Random();  // Create a Random object to generate random values.

    // **Constructor (Runs when a new NPC object is created)**
    public NPC() {
        this.race = races[rand.nextInt(races.length)];  // Selects a random race from the races array.
        this.name = Names.getRandomName(this.race);  // Calls the Names class to generate a race-appropriate name.
        this.gender = genders[rand.nextInt(genders.length)];  // Randomly picks a gender.
        this.ageGroup = ageGroups[rand.nextInt(ageGroups.length)];  // Randomly picks an age category.
        this.profession = professions[rand.nextInt(professions.length)];  // Randomly picks a profession.
        this.equipment = Equipment.getRandomEquipment();  // Calls the Equipment class to select a random item.
    }

    // 🔹 **Method to Get NPC Description**
    public String getDescription() {
        return name + " (" + gender + ", " + ageGroup + " " + race + ") - " 
               + profession + ", equipped with " + equipment;
    }
}

