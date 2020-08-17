package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Oksana
 */
public class GradebookHashMapPractice {
   public static void main(String[] args) {
      HashMap<Integer, String> students = new HashMap<>();

      Scanner in = new Scanner(System.in);

      String newStudent;
      int id = 1;


      do {
         System.out.println("Please, enter the name of student");
         newStudent = in.nextLine();
         if (!newStudent.equals("")) {
            System.out.println("Student " + id + ": " + newStudent);
            students.put(id, newStudent);
            id++;
         }

      } while (!newStudent.equals(""));

      System.out.println("\n Class roster: ");

      for (Map.Entry<Integer, String> student : students.entrySet()) {
         System.out.println(student.getKey() + ": " + student.getValue());
      }
   }
}
