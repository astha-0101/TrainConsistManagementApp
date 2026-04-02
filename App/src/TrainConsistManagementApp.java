import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // Sort bogies by capacity (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Bogies sorted by capacity:");

        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("Program continues...");
    }
}