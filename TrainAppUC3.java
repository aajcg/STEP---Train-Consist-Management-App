// File: TrainAppUC3.java

import java.util.HashSet;
import java.util.Set;

public class TrainAppUC3 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for Unique Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add Bogie IDs (duplicates will be ignored automatically)
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");
        bogieIds.add("B101"); // Duplicate
        bogieIds.add("B102"); // Duplicate

        // Display Unique Bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Display Total Unique Count
        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        // Program continues...
        System.out.println("\nSystem ensures no duplicate bogie IDs are stored.");
    }
}
