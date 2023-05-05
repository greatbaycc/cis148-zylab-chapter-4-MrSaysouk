import java.util.Scanner;

public class MaxOfTwo {
   
   /* Type your code here. */
   
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
