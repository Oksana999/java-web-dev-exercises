package exercises;

import java.util.Scanner;

/**
 * @author Oksana
 */
public class RectangleArea {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      double width = 0.0;
      double length = 0.0;


      System.out.println("Please, enter the width of rectangle: ");

      width = in.nextDouble();

      System.out.println("Please, enter the length of rectangle: ");

         length = in.nextDouble();


      System.out.println("Area of rectangle = "+width * length );


   }
}
