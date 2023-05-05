import java.util.Scanner;

public class LongestString {
   
   public String findLongest(String str1, String str2) {
       /* Type your code here. */
   }
   

   public static void main(String[] args) {
      LongestString mainObject = new LongestString();
      Scanner scnr = new Scanner(System.in);
      
      String str1;
      String str2;
      String longest;
      
      str1 = scnr.next();
      str2 = scnr.next();
      
      longest = mainObject.findLongest(str1, str2);
      
      System.out.println(longest);
   }
}
