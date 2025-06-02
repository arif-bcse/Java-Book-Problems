package ch4.java;
import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] prices = {0, 239.99, 129.75, 99.95, 350.89};
        double totalSales = 0;

        while (true) {
            System.out.print("Enter item number (1-4, 0 to quit): ");
            int item = input.nextInt();
            if (item == 0) break;
            if (item >= 1 && item <= 4)
                totalSales += prices[item];
            else
                System.out.println("Invalid item number.");
        }

        double earnings = 200 + 0.09 * totalSales;
        System.out.printf("Total earnings: $%.2f\n", earnings);
    }
}
