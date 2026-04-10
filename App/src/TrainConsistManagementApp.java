import java.util.*;

public class TrainConsistManagementApp {

    // -------- CUSTOM EXCEPTION --------
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // -------- PASSENGER BOGIE --------
    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        void display() {
            System.out.println("Created Bogie: " + type + " -> " + capacity);
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC14 ===");

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            b1.display();

            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            b2.display();

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Completed...");
    }
}