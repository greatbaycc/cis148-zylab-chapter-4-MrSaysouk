import java.util.Scanner;

public class GolfScores {

   public String golfScore(int par, int strokes) {

      if ((par != 3) && (par != 4) && (par != 5)) {
         return "Error";
      } else if (strokes == par) {
         return "Par";
      } else if (strokes <= (par - 2)) {
         return "Eagle";
      } else if (strokes <= (par - 1)) {
         return "Birdie";
      } else {
         return "Bogey";
      }
   }

   
   public static void main(String[] args) {
      GolfScores score = new GolfScores();
      Scanner scnr = new Scanner(System.in);
      int par;
      int strokes;
      String name;
      
      par = scnr.nextInt();
      strokes = scnr.nextInt();
      
      name = score.golfScore(par, strokes);
      
      System.out.println(name);
   }
}
