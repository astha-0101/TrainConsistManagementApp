import java.util.*;

public class TrainConsistManagementApp {

    // -------- CUSTOM RUNTIME EXCEPTION --------
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // -------- GOODS BOGIE --------
    static class GoodsBogie {
        String shape;   // Cylindrical / Rectangular
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Assign cargo with safety check
        void assignCargo(String cargo) {
            try {
                // Rule: Rectangular bogie cannot carry Petroleum
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Cargo validation completed for " + shape + " bogie");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC15: Safe Cargo Assignment ===");

        // Step 1: Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Step 2: Safe assignment
        b1.assignCargo("Petroleum");

        // Step 3: Unsafe assignment (handled safely)
        b2.assignCargo("Petroleum");

        System.out.println("UC15 runtime handling completed...");
    }
}