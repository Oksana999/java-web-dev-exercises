package org.launchcode.java.studios.areaofacircle;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Oksana
 */
public class Area {
   public static void main(String[] args){
      double area ;
      double radius;

      Scanner in = new Scanner(System.in);

      do {
         System.out.println("Please, enter the valid radius of circle:");

         while (!in.hasNextDouble()) {
            System.out.println("That not a number!");
            in.next();
         }

         radius = in.nextDouble();
      } while (radius <= 0);
      System.out.println("Thank you! Got " + radius);

      area = Circle.getArea(radius);

      String formattedDouble = new DecimalFormat("#0.000").format(area);

      System.out.println("The area of a circle of radius " + radius+" is: "+formattedDouble);

   }

}
