// File: TrainAppUC5.java

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainAppUC5 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for Train Formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add Bogies (insertion order will be preserved)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate - will be ignored

        // Display Final Formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        // Program continues...
        System.out.println("\nSystem ensures uniqueness while maintaining order.");
    }
}
