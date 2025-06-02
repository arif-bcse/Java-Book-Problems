package ch7.java;

import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] counters = new int[9]; // index 0 → $200–299, ..., index 8 → $1000 and over

        System.out.print("Enter number of salespeople: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("Enter gross sales for salesperson " + i + ": ");
            double sales = input.nextDouble();
            int salary = (int)(200 + 0.09 * sales); // calculate salary

            // Determine the correct range
            if (salary >= 1000)
                counters[8]++;
            else
                counters[(salary - 200) / 100]++;
        }

        // Print table header
        System.out.println("\nSalary Range\tNumber of People");
        for (int i = 0; i < counters.length; i++) {
            if (i == 8)
                System.out.println("$1000 and over\t" + counters[i]);
            else
                System.out.printf("$%d–%d\t\t%d\n", 200 + i * 100, 299 + i * 100, counters[i]);
        }
    }
}
