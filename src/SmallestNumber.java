import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int lowest;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();

        if ((num1 < num2) && (num1 < num3)) {
            lowest = num1;
        }
        else if ((num2 < num1) && (num2 < num3)) {
            lowest = num2;
        }

        else {
            lowest = num3;
        }

        System.out.println(lowest);
    }
}
