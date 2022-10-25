// For your math class you need a program to calculate the factorial of a number.
// Create a program that takes a number as input and calculate its factorial, then output it.

import java.util.Scanner;

public class WhileLoops {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    int factorial = 1;
    
    while (number > 0) {
      factorial *= number;
      number--;
    }
    
    System.out.println("The factorial of " + number + " is " + factorial);
    
  }
}
