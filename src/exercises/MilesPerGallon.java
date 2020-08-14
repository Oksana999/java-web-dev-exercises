package exercises;

import java.util.Scanner;

/**
 * @author Oksana
 */
public class MilesPerGallon {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      double miles = 0.0;
     double gallons = 0.0;
      double consumption = 0.0;

      System.out.println("Please, enter how many number of miles you have driven ?");
      miles = in.nextInt();

      System.out.println("Please, enter how many number of gallons did you spent ?");
      gallons = in.nextInt();

      consumption = gallons / miles;

      System.out.println("Your fuel consumption is: "+consumption+ " gallon per mile");
   }
}
