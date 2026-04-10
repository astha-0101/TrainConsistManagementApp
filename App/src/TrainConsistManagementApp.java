import java.util.*;

class GoodsBogie {
    String type;   // Cylindrical / Rectangular / Open
    String cargo;  // Petroleum / Coal / Grain

    // Constructor
    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    void display() {
        System.out.println(type + " -> Cargo: " + cargo);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Rectangular", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // Step 2: Apply safety check using Stream API
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Step 3: Display result
        System.out.println("Goods Bogies:");
        bogies.forEach(GoodsBogie::display);

        System.out.println("\nSafety Compliance Status: " + (isSafe ? "SAFE ✅" : "UNSAFE ❌"));
    }
}