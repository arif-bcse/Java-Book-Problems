package ch6.java;
import java.util.Scanner;

public class QualityPointsCalculator {

    // Method to calculate quality points based on average
    public static int qualityPoints(int average) {
        if (average >= 90 && average <= 100) {
            return 4;
        } else if (average >= 80 && average <= 89) {
            return 3;
        } else if (average >= 70 && average <= 79) {
            return 2;
        } else if (average >= 60 && average <= 69) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's average (0-100): ");
        int average = input.nextInt();

        // Validate input range
        if (average < 0 || average > 100) {
            System.out.println("Invalid average. Please enter a value between 0 and 100.");
        } else {
            int points = qualityPoints(average);
            System.out.println("Quality Points: " + points);
        }
    }
}
