// File: TrainAppUC20.java

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainAppUC20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create Bogie Collection (try empty and non-empty cases)
        List<String> bogieIds = new ArrayList<>();
        // Uncomment below to test normal behavior
        // bogieIds.add("B101");
        // bogieIds.add("B202");

        try {
            // Defensive Check (Fail-Fast)
            if (bogieIds.isEmpty()) {
                throw new IllegalStateException("Search operation failed: No bogies available in the train.");
            }

            // Input Search Key
            System.out.print("\nEnter Bogie ID to search: ");
            String key = scanner.nextLine();

            // Simple Linear Search
            boolean found = false;
            for (String id : bogieIds) {
                if (id.equals(key)) {
                    found = true;
                    break;
                }
            }

            // Display Result
            if (found) {
                System.out.println("\nBogie ID " + key + " FOUND.");
            } else {
                System.out.println("\nBogie ID " + key + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            // Handle Exception Gracefully
            System.out.println("\nError: " + e.getMessage());
        }

        // Program continues safely
        System.out.println("\nSystem enforces safe search operations.");

        scanner.close();
    }
}
