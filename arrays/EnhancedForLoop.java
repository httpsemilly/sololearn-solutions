// Your company is writing a program for a geometry course.
// The program takes the number of squares as the first input, creates an array, and then takes the sides of squares as its elements.
// Write the part of the program that receives a list of square sides and prints the area of those squares for the user.

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number of squares: ");
    int squareNum = scanner.nextInt();
    int[] sides =  new int[squareNum]; // Store the number of squares that will has its area calculate
    int area = 0;
    
      for (int i = 0; i < squareNum; i++) {
        sides[i] = scanner.nextInt(); // Store the number of the square's side
        area = sides[i] * sides[i];
        System.out.println(area);
      }
      
  }
}
