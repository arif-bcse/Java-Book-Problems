package ch7.java;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] uniqueNumbers = new int[5]; // max 5 unique numbers
        int count = 0; // number of unique numbers stored

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + " (10-100): ");
            int num = input.nextInt();

            // Validate range
            while (num < 10 || num > 100) {
                System.out.print("Invalid input. Enter number " + i + " (10-100): ");
                num = input.nextInt();
            }

            // Check for duplicate
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (uniqueNumbers[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueNumbers[count++] = num; // add unique number
                System.out.println("Number " + num + " accepted.");
            } else {
                System.out.println("Number " + num + " is a duplicate and will not be added.");
            }

            // Display all unique numbers so far
            System.out.print("Unique numbers so far: ");
            for (int k = 0; k < count; k++) {
                System.out.print(uniqueNumbers[k] + " ");
            }
            System.out.println("\n");
        }
    }
}
