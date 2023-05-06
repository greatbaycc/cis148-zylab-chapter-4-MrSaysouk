import java.util.Scanner;

public class MaxOfTwo {

   public int findMax(int num1, int num2) {
      int max;

      if (num1 > num2) {
         max = num1;
      } else {
         max = num2;
      }
      return max;
   }
   
   public static void main(String args[]) {
      MaxOfTwo maxObject = new MaxOfTwo();
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int max;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      max = maxObject.findMax(num1, num2);
      System.out.println("Max: " + max);
   }
}
