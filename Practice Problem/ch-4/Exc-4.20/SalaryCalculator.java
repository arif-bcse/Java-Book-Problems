package ch4.java;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter hours worked for employee " + i + ": ");
            double hours = input.nextDouble();

            System.out.print("Enter hourly rate for employee " + i + ": ");
            double rate = input.nextDouble();

            double pay = hours <= 40 ? hours * rate : 40 * rate + (hours - 40) * rate * 1.5;
            System.out.printf("Gross pay for employee %d: $%.2f\n\n", i, pay);
        }
    }
}
