import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double neg = 0;
        double pos = 0;
        double zeros = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] < 0) {
                neg++;
            }
            else if (arr[arr_i] > 0) {
                pos++;
            }
            else {
                zeros++;
            }
            
        }
        System.out.printf("%f\n" + "%f\n" + "%f\n", pos/n, neg/n, zeros/n);
    }
}
