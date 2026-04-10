import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    // Constructor
    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println(type + " -> Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies (reuse from UC7)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 75));

        // Step 2: Apply Stream filter (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):");
        filteredBogies.forEach(Bogie::display);

        // Step 4: Original list remains unchanged
        System.out.println("\nOriginal Bogies:");
        bogies.forEach(Bogie::display);
    }
}
