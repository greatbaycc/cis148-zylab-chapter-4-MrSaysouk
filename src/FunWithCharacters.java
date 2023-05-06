import java.util.Scanner;

public class FunWithCharacters {

   public String checkCharacter(String word, int index) {
      char c = word.charAt(index);
      String result;

      if (Character.isWhitespace(word.charAt(index))) {
         result = ("Character '" + c + "' is a white space");
      }
      else if (Character.isLetter(word.charAt(index))) {
         result = ("Character '" + c + "' is a letter");
      }
      else if (Character.isDigit(word.charAt(index))) {
         result = ("Character '" + c + "' is a digit");
      }
      else  {
         result = ("Character '" + c + "' is unknown");
      }

      return result;
   }
   
   public static void main(String[] args) {
      
      FunWithCharacters labObject = new FunWithCharacters();
      String word = "happy birthday"; // Set string
      int index = 2; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
      
      index = 5; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
      
      word = "happy birthday 2 you"; 
      index = 15; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
      
      word = "happy birthday!"; 
      index = 14; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
   }
}
