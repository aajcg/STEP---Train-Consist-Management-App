// File: TrainAppUC17.java

import java.util.Arrays;

public class TrainAppUC17 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Array of Bogie Names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        // Display Original Array
        System.out.println("\nOriginal Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Display Sorted Array
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        // Program continues...
        System.out.println("\nSorting completed using Arrays.sort().");
    }
}
