package DNDGenerator;

import java.util.Random;

public class Equipment {
    // Slumpgenerator
    private static final Random rand = new Random();

    // Lista över utrustningstyper
    private static final String[] equipmentTypes = {
        "Poor clothes", "Modest clothes", "Rich clothes",
        "Light armor", "Medium armor", "Heavy armor",
        "Magical equipment"
    };

    // Privat konstruktor för att förhindra instansering
    private Equipment() {}

    // Returnerar en slumpmässig utrustningstyp
    public static String getRandomEquipment() {
        return equipmentTypes[rand.nextInt(equipmentTypes.length)];
    }
}
