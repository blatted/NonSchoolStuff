/* Counts words in Camel case string
/ Input: s, a string
/ output: number of words
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Camelcase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int wordcount = 1;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            if(Character.isUpperCase(curr)) {
                wordcount++;
            }
        }
        System.out.print(wordcount);
    }
}