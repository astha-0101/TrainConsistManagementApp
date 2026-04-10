import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    String type;
    int capacity;

    // Constructor
    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    // Display method
    public void display() {
        System.out.println("Type: " + type + ", Capacity: " + capacity);
    }
}

// Main class (IMPORTANT: as asked)
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));

        // Step 2: Filter using Stream API
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)   // condition
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):");

        for (Bogie b : filteredBogies) {
            b.display();
        }

        // Step 4: Show original list unchanged
        System.out.println("\nOriginal Bogies:");

        for (Bogie b : bogies) {
            b.display();
        }
    }
}