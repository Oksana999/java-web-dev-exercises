package exercises;

import java.util.Scanner;

/**
 * @author Oksana
 */
public class Alice {
   public static void main(String[] args){
     String str = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
             "and of having nothing to do: once or twice she had peeped into the book her sister " +
             "was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
             "thought Alice 'without pictures or conversation?";


      Scanner in = new Scanner(System.in);
      System.out.println("Please, enter the world ypu are searching: ");

      int index1, index2 = 0;
      String newString = "";

      String search = in.next().toLowerCase();


//      String[] listOfWords = str.split(" ");
      if(str.toLowerCase().contains(search.toLowerCase())){
         index1 = str.toLowerCase().indexOf(search);
         index2 = index1 + search.length();

         String sub = str.substring(index1, index2);
         newString = str.replace(sub, "");



         System.out.println("Found "+search+" index = "+index1);

         System.out.println("New sentence: "+newString);
      }else{
         System.out.println("Not found "+search);
      }
   }
}
