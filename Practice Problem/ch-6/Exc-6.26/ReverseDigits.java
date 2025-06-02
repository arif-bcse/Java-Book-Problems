package ch6.java;
import java.util.Scanner;

public class ReverseDigits {

    // Method to reverse digits of an integer
    public static int reverse(int number) {
        int reversed = 0;
        int num = Math.abs(number);  // handle negative numbers
        
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        // Preserve sign if input was negative
        return (number < 0) ? -reversed : reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = input.nextInt();
        
        int reversedValue = reverse(value);
        System.out.println("Reversed number: " + reversedValue);
    }
}
