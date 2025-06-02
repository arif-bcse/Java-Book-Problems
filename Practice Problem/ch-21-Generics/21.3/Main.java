package learning.java;
import java.util.Arrays;
 class Main {

     public static void main(String[] args) {

         Integer[] a = {100, 22, 58, 41, 6, 50};

         Float[] f = {100.2f, 22.5f, 58.25f, 41.6f, 6.50f, 50.10f};
         
         System.out.print("Sorted Integer array:  ");
         selectionSort(a);
         System.out.println();
         System.out.print("Sorted Float array:  ");
         selectionSort(f);



     }

     public static <T extends Comparable<T>> void selectionSort(T[] a){
         Arrays.sort(a);
         //print array
         for(T i: a){
             System.out.print(i +" ,");
         }

     }

 }

