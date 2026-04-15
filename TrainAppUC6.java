// File: TrainAppUC6.java

import java.util.HashMap;
import java.util.Map;

public class TrainAppUC6 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for Bogie-Capacity Mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert Bogie Capacities (Key-Value Mapping)
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 40);

        // Display Capacity Details using entrySet()
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + 
                               " | Capacity: " + entry.getValue());
        }

        // Example of Fast Lookup
        String searchBogie = "Sleeper";
        System.out.println("\nCapacity of " + searchBogie + ": " 
                + bogieCapacityMap.get(searchBogie));

        // Program continues...
        System.out.println("\nSystem supports efficient bogie-capacity mapping.");
    }
}
