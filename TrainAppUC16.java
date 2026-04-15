// File: TrainAppUC16.java

public class TrainAppUC16 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Array of Passenger Bogie Capacities
        int[] capacities = {72, 60, 40, 80, 55};

        // Display Original Array
        System.out.println("\nOriginal Capacities:");
        printArray(capacities);

        // Bubble Sort Algorithm
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display Sorted Array
        System.out.println("\nSorted Capacities (Ascending):");
        printArray(capacities);

        // Program continues...
        System.out.println("\nSorting completed using Bubble Sort.");
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
