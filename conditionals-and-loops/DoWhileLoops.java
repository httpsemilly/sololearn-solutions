// You're creating a bank security system. The user must insert the correct password in order to access payments. The password is 8819.
// Write a program that will continuously take a password as input and output Write password, until the client inserts the correct password.

import java.util.Scanner;

public class DoWhileLoops {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int password = 8819;
    
    do {
      System.out.print("Enter the password: ");
      password = scanner.nextInt();
    } while (password != 8819);
    
  }
}
