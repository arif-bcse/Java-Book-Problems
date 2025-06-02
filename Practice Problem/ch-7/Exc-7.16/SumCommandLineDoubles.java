package ch7.java;
public class SumCommandLineDoubles {
    public static void main(String[] args) {
        double sum = 0.0;

        for (String arg : args) {
            try {
                double value = Double.parseDouble(arg);
                sum += value;
            } catch (NumberFormatException e) {
                System.out.println("Ignoring invalid input: " + arg);
            }
        }

        System.out.printf("Sum of command-line doubles: %.2f\n", sum);
    }
}
