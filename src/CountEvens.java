import java.util.Scanner;

public class CountEvens {
   
   /* Type your code here */
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      CountEvens labObject = new CountEvens();
      
      int num1;
      int num2;
      int num3;
      int num4;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();
      
		int result = labObject.countEvens(num1, num2, num3, num4);
		System.out.println("Total evens: " + result);
   }
}
