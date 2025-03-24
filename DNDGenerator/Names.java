package DNDGenerator;
import java.util.Random; // lib for random
public class Names {
    
     // Skapa en statisk Random-instans så att den kan återanvändas
     private static Random rand = new Random();

    // Namnlistor kopplade till respektive ras
    private static final String[] humanNames = {"John", "Elena", "Robert"};
    private static final String[] dwarfNames = {"Borin", "Durin", "Thrain"};
    private static final String[] elfNames = {"Aelorin", "Elanil", "Faelar"};
    private static final String[] orcNames = {"Grom", "Ugluk", "Morgash"};
    private static final String[] dragonbornNames = {"Rhogar", "Balasar", "Donaar"};
    private static final String[] tieflingNames = {"Zariel", "Lilith", "Kael"};
    private static final String[] halflingNames = {"Pip", "Milo", "Rosie"};
    private static final String[] gnomeNames = {"Fizzwick", "Tink", "Nimble"};

    // Privat konstruktor för att förhindra instansiering
    private Names() {}

    // Returnerar ett namn baserat på rasens namn
    public static String getRandomName(String race) {
        switch (race) {
            case "Human":
                return humanNames[rand.nextInt(humanNames.length)];
            case "Dwarf":
                return dwarfNames[rand.nextInt(dwarfNames.length)];
            case "Elf":
                return elfNames[rand.nextInt(elfNames.length)];
            case "Orc":
                return orcNames[rand.nextInt(orcNames.length)];
            case "Dragonborn":
                return dragonbornNames[rand.nextInt(dragonbornNames.length)];
            case "Tiefling":
                return tieflingNames[rand.nextInt(tieflingNames.length)];
            case "Halfling":
                return halflingNames[rand.nextInt(halflingNames.length)];
            case "Gnome":
                return gnomeNames[rand.nextInt(gnomeNames.length)];
            default:
                return "Nameless One"; // Fallback om rasen inte matchar
        }
    }
}
