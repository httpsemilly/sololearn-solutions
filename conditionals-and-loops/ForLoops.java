// Create a program that takes the number of students who enter the university as input and output "Welcome" for each student.

import java.util.Scanner;

public class ForLoops {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number of students: ");
    int studentsNum = scanner.nextInt();
    
    for (int i = 1; i <= studentsNum; i++) {
      System.out.println("Welcome!");
    }
  }
}
