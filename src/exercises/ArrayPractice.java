package exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Oksana
 */
public class ArrayPractice {
   public static void main(String[] args){
     int []  array =  {1, 1, 2, 3, 5, 8};

      System.out.print("Array's elements: ");
     for(int item : array){
        System.out.print(item + ", ");
     }
      System.out.println();
      System.out.print("Odd numbers: ");
      for (int item : array) {
         if( item % 2 > 0){
            System.out.print(item + ", ");
         }
      }
      System.out.println();

      String str = "I would not, could not, in a box. I would not, could not with a fox. " +
              "I will not eat them in a house. I will not eat them with a mouse.";

      String [] strArray = str.split(" ");

      System.out.println(Arrays.toString(strArray));

      String [] strArray1 = str.split("\\.");

      System.out.println(Arrays.toString(strArray1));

   }
}
