import java.util.Scanner;

public class MaxOfThree {
   
   /* Type your code here. */
   
   public static void main(String args[]) {
      MaxOfThree maxObject = new MaxOfThree();
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      int max;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      max = maxObject.findMax(num1, num2, num3);
      System.out.println("Max: " + max);
   }
}
