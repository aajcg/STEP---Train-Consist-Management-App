// File: TrainAppUC10.java

import java.util.ArrayList;
import java.util.List;

// Reusing Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity;
    }
}

public class TrainAppUC10 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // Display Bogies
        System.out.println("\nBogies in Train:");
        bogies.forEach(System.out::println);

        // Stream Pipeline: map + reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)              // Extract capacity
                .reduce(0, Integer::sum);          // Aggregate (sum)

        // Display Total Capacity
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        // Program continues...
        System.out.println("\nSystem supports capacity aggregation using streams.");
    }
}
