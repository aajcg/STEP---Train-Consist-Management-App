// File: TrainAppUC14.java

import java.util.ArrayList;
import java.util.List;

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    String name;
    int capacity;

    // Constructor with validation
    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException(
                "Invalid capacity for " + name + ". Capacity must be greater than 0."
            );
        }
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity;
    }
}

public class TrainAppUC14 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // Valid Bogies
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 60));

            // Invalid Bogie (will throw exception)
            bogies.add(new PassengerBogie("First Class", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        // Display Valid Bogies Only
        System.out.println("\nCurrent Train Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }

        // Program continues safely
        System.out.println("\nSystem prevents invalid bogie creation using exceptions.");
    }
}
