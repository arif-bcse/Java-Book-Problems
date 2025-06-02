package learning.java;
import java.util.Arrays;
class Main{


    public static <T> void print(T item) {
        System.out.println("Generic print(T): " + item);
    }


    public static void print(String item) {
        System.out.println("Specific print(String): " + item);
    }

    public static void print(Integer item) {
        System.out.println("Specific print(Integer): " + item);
    }

    public static void main(String[] args) {
        print(123);
        print("Hello");
        print(123.45);      

    }
}

