import java.io.*;
import java.util.*;

// Insertion sort part 2 from hackerrank 

public class InsertionSort {

    public static void insertionSortPart2(int[] ar, int s)
    {
           for (int i = 1; i < s; i++) {
               if (ar[i] < ar[i-1]) {
                   //System.out.println(ar[i]);
                   int index = i;
                   int save = ar[i];
                   while (index > 0 && save < ar[index-1]) {
                       //System.out.println("while " + ar[index]);
                       ar[index] = ar[index-1];
                       //System.out.println("while " + ar[index]);
                       index--;
                   }
                   ar[index] = save;
                   //System.out.println("save " + ar[i-1]);



               }
               for (int j = 0; j < s; j++) {
                    System.out.print(ar[j] + " ");
               }
               System.out.println();
           }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
       }
       insertionSortPart2(ar, s);

    }
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
