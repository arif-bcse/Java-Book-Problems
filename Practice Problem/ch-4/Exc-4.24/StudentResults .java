package ch4.java;

import java.util.Scanner;


public class StudentResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            // Validate input
            while (result != 1 && result != 2) {
                System.out.print("Invalid input. Enter 1 for pass or 2 for fail: ");
                result = input.nextInt();
            }

            if (result == 1)
                passes++;
            else
                failures++;

            counter++;
        }

        System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);

        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}
