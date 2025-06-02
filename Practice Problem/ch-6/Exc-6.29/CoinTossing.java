package ch6.java;
import java.util.Random;
import java.util.Scanner;

public class CoinTossing {

    enum Coin { HEADS, TAILS }

    static Random random = new Random();

    // Method to simulate coin flip
    public static Coin flip() {
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Toss Coin");
            System.out.println("2. Display Results");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                Coin result = flip();
                System.out.println("You got: " + result);
                if (result == Coin.HEADS) headsCount++;
                else tailsCount++;
            } else if (choice == 2) {
                System.out.println("Heads count: " + headsCount);
                System.out.println("Tails count: " + tailsCount);
            } else if (choice == 3) {
                System.out.println("Exiting program.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
