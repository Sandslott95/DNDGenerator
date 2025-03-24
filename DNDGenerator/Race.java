package DNDGenerator;
import java.util.Random; // Importera random-biblioteket

public class Race {
    
    // Skapa en statisk Random-instans så att den kan återanvändas
    private static final Random rand = new Random();

    // Lista över raser
    private static final String[] races = {
        "Human", "Dwarf", "Elf", "Orc", "Dragonborn", "Tiefling", "Halfling", "Gnome"
    };

    // Konstruktorn är onödig, så vi tar bort den eller gör den privat för att förhindra instansering.
    private Race() {}

    // Metod för att hämta en slumpmässig ras
    public static String getRandomRace() {
        return races[rand.nextInt(races.length)];
    }
}
