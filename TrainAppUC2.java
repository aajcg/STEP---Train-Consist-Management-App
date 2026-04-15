// File: TrainAppUC2.java

import java.util.ArrayList;
import java.util.List;

public class TrainAppUC2 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add Bogies (CREATE)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display Bogies (READ)
        System.out.println("\nBogies after addition:");
        System.out.println(passengerBogies);

        // Remove a Bogie (DELETE)
        passengerBogies.remove("AC Chair");

        // Check Existence (SEARCH)
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper exist? " + hasSleeper);

        // Final List State
        System.out.println("\nFinal bogie list:");
        System.out.println(passengerBogies);

        // Program continues...
        System.out.println("\nSystem ready for further operations.");
    }
}
