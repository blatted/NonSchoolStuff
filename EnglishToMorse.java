import java.util.*;

/* A program to translate english to morse, or vise versa */

public class EnglishToMorse {
   
   public static void main(String[] args) {
   
      String alphabet[] = {" ","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};    
      String morse[] = {"  ",".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
      
      Scanner n = new Scanner(System.in);
      
      System.out.println("Enter either English or Morse for translation (If morse, separate letters by one space and words by two spaces): ");
      String input = n.nextLine();
      int len = input.length();
      
      // Check if either morse or english
      input.trim();
      // Input is Morse
      if (input.charAt(0) == '.' || input.charAt(0) == '-') {
         for (int i = 0; i < len; i++) {
            String c = "";
            // Check for two spaces, i.e. separate words
            if (input.charAt(i) == ' ') {
               if (i != len && input.charAt(i-1) == ' ') {
                  c = "  ";
               }
            }
            // Get whole letter
            while (i != len && input.charAt(i) != ' ') {
            
               c += Character.toString(input.charAt(i));
               i++;
             
            }
            
            int index = Arrays.asList(morse).indexOf(c);
            System.out.format("%s",alphabet[index]);
            
         }
      
      
      }
      // Input is English
      else {
         for (int i = 0; i < len; i++) {
            String c = Character.toString(input.charAt(i));
            if (c.equals(" ")) {
               System.out.format("%s", "  ");
            }
            else {
               c.toLowerCase();
               int index = Arrays.asList(alphabet).indexOf(c);
               
               System.out.format("%s ",morse[index]);
            }
         }
      }

      
      
   
   
   }
   
}