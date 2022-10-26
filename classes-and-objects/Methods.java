// You are creating a robot, "Welcomer 2000", that never fails to greet a single person it encounters. 
// You provide the number of people that will enter the room, and the robot will shout "Welcome" that number of times.
// Create a program that takes a number as input and calls the method according provided count.

import java.util.Scanner;

public class Methods {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number of people: ");
    int numOfPeople = scanner.nextInt();
    
    for (int i = 0; i < numOfPeople; i++) {
      welcome();
    }
  }
  
  public static void welcome() {
    System.out.println("Welcome!");
  }
}
