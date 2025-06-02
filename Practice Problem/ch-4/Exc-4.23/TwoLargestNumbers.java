package ch4.java;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);
    }
}
