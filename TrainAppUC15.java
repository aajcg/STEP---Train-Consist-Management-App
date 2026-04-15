// File: TrainAppUC15.java

import java.util.ArrayList;
import java.util.List;

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    String shape;  // Cylindrical / Rectangular
    String cargo;  // Petroleum / Coal / Goods

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Method to assign cargo safely
    void assignCargo(String cargo) {
        try {
            // Rule: Rectangular bogie cannot carry Petroleum
            if (shape.equalsIgnoreCase("Rectangular") &&
                cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                    "Unsafe Cargo! Cannot assign Petroleum to Rectangular bogie."
                );
            }

            this.cargo = cargo;
            System.out.println("Cargo '" + cargo + "' assigned to " + shape + " bogie.");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed for " + shape + " bogie.\n");
        }
    }

    @Override
    public String toString() {
        return "Shape: " + shape + " | Cargo: " + (cargo != null ? cargo : "None");
    }
}

public class TrainAppUC15 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        List<GoodsBogie> bogies = new ArrayList<>();

        // Create Bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        bogies.add(b1);
        bogies.add(b2);

        // Assign Cargo Safely
        b1.assignCargo("Petroleum");   // Valid
        b2.assignCargo("Petroleum");   // Invalid → Exception handled

        // Display Final State
        System.out.println("Final Bogie States:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        // Program continues...
        System.out.println("\nSystem handles unsafe cargo assignments gracefully.");
    }
}
