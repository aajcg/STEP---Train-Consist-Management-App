// File: TrainAppUC9.java

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Extended Bogie class with type
class Bogie {
    String name;
    int capacity;
    String type; // Passenger / Freight

    // Constructor
    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainAppUC9 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 60, "Passenger"));
        bogies.add(new Bogie("First Class", 40, "Passenger"));
        bogies.add(new Bogie("Cargo", 100, "Freight"));
        bogies.add(new Bogie("Parcel", 80, "Freight"));

        // Grouping using Stream API
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // Display Grouped Result
        System.out.println("\nGrouped Bogies by Type:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        // Program continues...
        System.out.println("\nSystem supports grouping of bogies for analysis.");
    }
}
