import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println(year + " - leap year");
        }
        else {
            System.out.println(year + " - not a leap year");
        }
    }
}
