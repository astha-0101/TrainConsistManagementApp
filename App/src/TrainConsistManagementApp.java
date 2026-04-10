import java.util.regex.*;
import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Step 2: Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Step 3: Compile patterns
        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        // Step 4: Match input
        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        boolean isTrainValid = m1.matches();
        boolean isCargoValid = m2.matches();

        // Step 5: Display results
        if (isTrainValid) {
            System.out.println("Train ID is VALID ");
        } else {
            System.out.println("Train ID is INVALID ");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID ");
        } else {
            System.out.println("Cargo Code is INVALID ");
        }

        sc.close();
    }
}