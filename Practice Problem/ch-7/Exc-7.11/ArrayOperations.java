package ch7.java;
public class ArrayOperations {
    public static void main(String[] args) {
        // a) Set the 10 elements of counts to zero
        int[] counts = new int[10];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        // b) Add one to each of the 15 elements of bonus
        int[] bonus = new int[15];
        // Assume bonus is initially filled with some values, here for demo we fill with zeros first
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] = 0; // initialize with zero
        }
        // Now add one to each element
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] += 1;
        }

        // c) Display the five values of bestScores in column format using enhanced for loop
        int[] bestScores = {88, 92, 76, 81, 95};
        System.out.println("Best Scores:");
        for (int score : bestScores) {
            System.out.println(score);
        }
    }
}
