package ch7.java;
public class ProductCalculator {

    // Method with variable-length argument list
    public static int product(int... numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Product of 2, 3: " + product(2, 3));                // 6
        System.out.println("Product of 4, 5, 6: " + product(4, 5, 6));          // 120
        System.out.println("Product of 7, 8, 9, 10: " + product(7, 8, 9, 10));  // 5040
        System.out.println("Product of no arguments: " + product());            // 1 (neutral element)
    }
}
