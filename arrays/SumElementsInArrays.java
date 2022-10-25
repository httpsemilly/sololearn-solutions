// Create a program that takes the length of the array as the first input, creates it, and then takes the next inputs as elements of the array.
// The program should go through the array and calculate the sum of the numbers that are multiples of 4.

import java.util.Scanner;

public class SumElementsInArrays {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Length of the array: ");
    int lengthArr = scanner.nextInt();
    int[] array = new int[lengthArr];
    int x = 0;
    int sum = 0;
    
    // Add elements to the array
    for (int i = 0; i < lengthArr; i++) {
      array[i] = scanner.nextInt();
    }
    
    while (x < lengthArr) {
      if (array[x] % 4 == 0) {
        sum = sum + array[x];
      }
      x++;
    }
    
    System.out.println("The sum of the numbers that are multiples of 4 is " + sum);
    
  }
}
