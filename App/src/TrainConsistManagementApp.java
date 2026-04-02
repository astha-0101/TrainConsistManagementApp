import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // LinkedHashSet to maintain order + uniqueness
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate bogie
        trainFormation.add("Sleeper"); // will be ignored

        // Display final formation
        System.out.println("Final Train Formation: " + trainFormation);

        System.out.println("Program continues...");
    }
}