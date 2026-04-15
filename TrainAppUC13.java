// File: TrainAppUC13.java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie Class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainAppUC13 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create Large Dataset of Bogies
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Bogie" + i, i % 100));
        }

        // ---------------- LOOP-BASED FILTERING ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 50) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM-BASED FILTERING ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 50)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Display Results
        System.out.println("\nLoop Filtering Time: " + loopTime + " ns");
        System.out.println("Stream Filtering Time: " + streamTime + " ns");

        // Basic Comparison Insight
        System.out.println("\nResult Size (Loop): " + loopResult.size());
        System.out.println("Result Size (Stream): " + streamResult.size());

        // Program continues...
        System.out.println("\nPerformance comparison completed.");
    }
}
