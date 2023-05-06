import java.util.Scanner;

public class GrayRemoverRGB {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    int red;
    int green;
    int blue;
    int lowest;

    red = scnr.nextInt();
    green = scnr.nextInt();
    blue = scnr.nextInt();

    if ((red < green) && (red < blue)) {
      lowest = red;
    }

    else if (green < blue) {
      lowest = green;
    }

    else {
      lowest = blue;
    }

    red -= lowest;
    green -= lowest;
    blue -= lowest;

    System.out.println(red + " " + green + " " + blue);
  }
}
