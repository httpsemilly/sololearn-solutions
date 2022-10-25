// Create a code that takes the amount of days as input, and then convert it to seconds and output the result.

import java.util.Scanner;

public class TimeConverter {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Amount of days: ");
    int days = scanner.nextInt();
    int seconds = days * 86400 // One day has 86400 seconds!
      
    System.out.println(days + " days have " + seconds + "seconds!");
    
  } 
}
