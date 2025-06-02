package ch4.java;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles, gallons, totalMiles = 0, totalGallons = 0;

        while (true) {
            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
            if (miles == -1) break;

            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            totalMiles += miles;
            totalGallons += gallons;

            System.out.printf("Miles per gallon this trip: %.2f\n", (double)miles / gallons);
            System.out.printf("Total miles per gallon: %.2f\n\n", (double)totalMiles / totalGallons);
        }
    }
}
