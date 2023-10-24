package Strings;
import java.util.StringJoiner;
public class ArrayOfStrings {
   public static void main(String args[]) {
      String stringArray[] = {"Hello", " how", " are", " you", " welcome", " to", " Tutorialspoint"};
      StringJoiner joiner = new StringJoiner(".");
      for(int i = 0; i < stringArray.length; i++) {
         joiner.add(stringArray[i]);
      }
      String str = joiner.toString();
      System.out.println(str);
   }
}