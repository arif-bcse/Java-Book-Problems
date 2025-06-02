package ch7.java;
import java.util.Random;

public class ArraySizeFromCommandLine {
    public static void main(String[] args) {
        int size = 10; // default size
        
        // Check if user supplied a command-line argument
        if (args.length > 0) {
            try {
                size = Integer.parseInt(args[0]);
                if (size <= 0) {
                    System.out.println("Array size must be positive. Using default size 10.");
                    size = 10;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for array size. Using default size 10.");
            }
        }

        int[] array = new int[size];
        Random random = new Random();

        // Initialize array with random integers 0-99
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        // Display array contents
        System.out.println("Array contents:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
