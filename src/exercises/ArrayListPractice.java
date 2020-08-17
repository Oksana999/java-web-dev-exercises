package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Oksana
 */
public class ArrayListPractice {
   public static void main(String[] args){
     ArrayList<Integer> numbers = new ArrayList<>();
      for (int i = 0; i < 10; i++) {
         numbers.add(i);
      }
      System.out.println(oddNumberSum(numbers));

      String str = "I would not, could not, in a box. I would not, could not with a fox. " +
              "I will not eat them in a house. I will not eat them with a mouse.";


      fiveLettersPrint(str);



      Scanner in = new Scanner(System.in);
      String text = "";
      String word;

      System.out.println("Please, enter the word: ");
      do{
         word = in.nextLine();
         if(!word.equals("")){
             text = String.join(" ", word);

         }

      }while(!word.equals(""));


      fiveLettersPrint(text);


   }

   public static int oddNumberSum (ArrayList<Integer> list){
      int sum = 0;
      for (Integer item : list) {
         if(item%2 > 0){
            sum +=item;
         }
      }
      return sum;
   }

   public static void fiveLettersPrint(String str){
      List<String> list = new ArrayList<String>(Arrays.asList(str.replace(",", "").split(" ")));

      for (String item : list) {
         if(item.length() == 5){
            System.out.println(item);
         }
      }
   }
}
