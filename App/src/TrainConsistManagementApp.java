import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("======================================\n");

        // Step 1: Create bogie array (empty case)
        String[] bogieIds = {};

        // Step 2: Search key
        String searchId = "BG101";

        // Step 3: FAIL-FAST VALIDATION
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

        // Step 4: Search logic (only runs if not empty)
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        // Step 5: Display result
        if (found) {
            System.out.println("Bogie " + searchId + " found.");
        } else {
            System.out.println("Bogie " + searchId + " NOT found.");
        }

        System.out.println("\nUC20 execution completed...");
    }
}