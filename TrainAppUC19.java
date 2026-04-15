// File: TrainAppUC19.java

import java.util.Arrays;
import java.util.Scanner;

public class TrainAppUC19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Sorted Array of Bogie IDs
        String[] bogieIds = {"B101", "B123", "B210", "B305", "B450"};

        // Ensure sorted (good practice)
        Arrays.sort(bogieIds);

        // Display Bogie IDs
        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Input Search Key
        System.out.print("\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        // Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                low = mid + 1;   // Search right half
            } else {
                high = mid - 1;  // Search left half
            }
        }

        // Display Result
        if (found) {
            System.out.println("\nBogie ID " + key + " FOUND in the train.");
        } else {
            System.out.println("\nBogie ID " + key + " NOT FOUND.");
        }

        // Program continues...
        System.out.println("\nBinary search completed.");

        scanner.close();
    }
}
