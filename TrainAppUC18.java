// File: TrainAppUC18.java

import java.util.Scanner;

public class TrainAppUC18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Array of Bogie IDs (Unsorted)
        String[] bogieIds = {"B101", "B305", "B210", "B450", "B123"};

        // Display Available Bogie IDs
        System.out.println("\nAvailable Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }
        System.out.println();

        // Input Search Key
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Linear Search
        boolean found = false;
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break; // Early termination
            }
        }

        // Display Result
        if (found) {
            System.out.println("\nBogie ID " + searchKey + " FOUND in the train.");
        } else {
            System.out.println("\nBogie ID " + searchKey + " NOT FOUND.");
        }

        // Program continues...
        System.out.println("\nLinear search completed.");

        scanner.close();
    }
}
