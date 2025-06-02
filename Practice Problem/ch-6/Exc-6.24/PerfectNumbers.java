package ch6.java;
public class PerfectNumbers {
    
    // Method to check if a number is perfect
    public static boolean isPerfect(int number) {
        int sum = 1; // 1 is always a factor (except for 1 itself)
        if (number == 1) return false; // 1 is not perfect
        
        // Check factors up to sqrt(number)
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                sum += i;
                int otherFactor = number / i;
                if (otherFactor != i) { // add the paired factor if different
                    sum += otherFactor;
                }
            }
        }
        
        return sum == number;
    }

    // Method to print factors (excluding the number itself)
    public static void printFactors(int number) {
        System.out.print("Factors: 1");
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                System.out.print(" + " + i);
                int otherFactor = number / i;
                if (otherFactor != i) {
                    System.out.print(" + " + otherFactor);
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int max = 1000; // change this to test bigger ranges
        
        System.out.println("Perfect numbers between 1 and " + max + ":");
        for (int num = 2; num <= max; num++) {
            if (isPerfect(num)) {
                System.out.print(num + " = ");
                printFactors(num);
            }
        }
    }
}
