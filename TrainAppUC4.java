// File: TrainAppUC4.java

import java.util.LinkedList;

public class TrainAppUC4 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for Train Consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add Bogies (initial order)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (index 1)
        trainConsist.add(1, "Pantry Car");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(trainConsist);

        // Final Ordered Train Consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        // Program continues...
        System.out.println("\nSystem maintains ordered bogie structure.");
    }
}
