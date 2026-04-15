// File: TrainAppUC12.java

import java.util.ArrayList;
import java.util.List;

// Goods Bogie Class
class GoodsBogie {
    String type;   // Cylindrical / Box / Flat
    String cargo;  // Petroleum / Coal / Goods

    // Constructor
    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Type: " + type + " | Cargo: " + cargo;
    }
}

public class TrainAppUC12 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create List of Goods Bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Flat", "Goods"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // Display Bogies
        System.out.println("\nGoods Bogies:");
        bogies.forEach(System.out::println);

        // Safety Compliance Check using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    // Rule: Cylindrical → only Petroleum allowed
                    if (b.type.equalsIgnoreCase("Cylindrical")) {
                        return b.cargo.equalsIgnoreCase("Petroleum");
                    }
                    return true; // other types are allowed
                });

        // Display Result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT.");
        } else {
            System.out.println("\nTrain is NOT SAFE! Invalid cargo configuration.");
        }

        // Program continues...
        System.out.println("\nSystem enforces safety rules using functional validation.");
    }
}
