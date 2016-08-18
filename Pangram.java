/* Determine if a sentence is a pangram
/  Input: s, a string
/  Output: "pangram" if the string is a pangram, "not pangram" if not
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        int len = s.length();
        //System.out.print(len);
        s.toLowerCase();
        for (int i = 0; i < len; i++) {
            alphabet.remove(s.charAt(i));
        }
        if (alphabet.isEmpty()) {
            System.out.println("pangram");
            
        }
        else {
            System.out.printf("%s", "not pangram");
        }
    }
}