package org.launchcode.java.studios.areaofacircle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Oksana
 */
public class CountingCharacters {

   public static void main(String[] args) {
      String str = "If the product of two terms is zero then common sense says at least one " +
              "of the two terms has to be zero to start with. So if you move all the terms over " +
              "to one side, you can put the quadratics into a form that can be factored allowing " +
              "that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward " +
              "from there.".toLowerCase();

      char[] chars = str.toCharArray();

      countCharacters(chars);

      Scanner in = new Scanner(System.in);
      StringBuilder sentence = new StringBuilder();
      String newLine;

      do {
         System.out.println("Please, enter the sentence: ");
         newLine = in.nextLine();
         sentence.append(newLine);
      } while (!newLine.equals(""));

      chars = sentence.toString()
              .toLowerCase()
              .replaceAll("\\W+", "")
              .toCharArray();

      countCharacters(chars);

      String fileTxt = readFromFile().toLowerCase();
      countCharacters(fileTxt.toCharArray());
   }

   private static void countCharacters(char[] chars) {
      HashMap<Character, Integer> listOfchars = new HashMap<>();

      for (char aChar : chars) {
         int counter = 0;
         char charForCalculate = aChar;
         for (char c : chars) {
            if (c == charForCalculate) {
               counter++;
            }
         }
         listOfchars.put(charForCalculate, counter);
      }

      for (Map.Entry<Character, Integer> item : listOfchars.entrySet()) {
         System.out.println(item.getKey() + ": " + item.getValue());
      }
   }

   private static String readFromFile() {
      Scanner sc2 = null;
      try {
         sc2 = new Scanner(new File("src/org/launchcode/java/studios/areaofacircle/file.txt"));
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }

      StringBuilder s = new StringBuilder();
      while (sc2.hasNextLine()) {
         Scanner s2 = new Scanner(sc2.nextLine());
         while (s2.hasNext()) {
            s.append(s2.next().replaceAll("\\W+", ""));
         }
      }

      return s.toString();
   }
}
