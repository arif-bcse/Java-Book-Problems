package ch7.java;
import java.util.Random;

public class DiceRollingSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int rolls = 36_000_000;
        int[] tally = new int[13]; // indices 2 to 12 will be used

        for (int i = 0; i < rolls; i++) {
            int die1 = random.nextInt(6) + 1; // 1 to 6
            int die2 = random.nextInt(6) + 1; // 1 to 6
            int sum = die1 + die2;
            tally[sum]++;
        }

        System.out.println("Sum\tOccurrences");
        for (int sum = 2; sum <= 12; sum++) {
            System.out.printf("%2d\t%,d%n", sum, tally[sum]);
        }
    }
}
