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

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 75));

        // Step 2: Group bogies by type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // Step 3: Display grouped bogies
        System.out.println("Grouped Bogies:");

        for (String key : groupedBogies.keySet()) {
            System.out.println("\nType: " + key);

            for (Bogie b : groupedBogies.get(key)) {
                b.display();
            }
        }

        // Step 4: Original list remains unchanged
        System.out.println("\nOriginal Bogies:");
        bogies.forEach(Bogie::display);
    }
}