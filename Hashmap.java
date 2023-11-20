package code20;



import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Hashmap {

    public static void main(String[] args) {
        // Create a HashMap to store random integer keys and double values
        Map<Integer, Double> randomMap = new HashMap<>();

        // Generate and store 10 random key-value pairs
        for (int i = 0; i < 10; i++) {
            int randomKey = generateRandomInt();
            double randomValue = generateRandomDouble();
            randomMap.put(randomKey, randomValue);
        }

        // Print the data stored in the HashMap
        System.out.println("Data stored in the HashMap:");
        for (Map.Entry<Integer, Double> entry : randomMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // Method to generate a random integer
    private static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }

    // Method to generate a random double
    private static double generateRandomDouble() {
        Random random = new Random();
        return random.nextDouble();
    }
}

