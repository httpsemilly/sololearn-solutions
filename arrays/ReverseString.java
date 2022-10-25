// Write a program to take a string as input and output its reverse.

import java.util.Scanner;

public class ReverseString {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a phrase: ");
    String text = scanner.nextLine();
    char[] arr = text.toCharArray();
    
    // i store the number of elements in the array
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.println(arr[i]); // print the element in the index i
    }
  }
}
