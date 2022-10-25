// You have $12,000 to buy a car.
// Create a program that takes the price of a car as an input, then output "yes" if the price is lower than or equal to 12,000.

import java.util.Scanner;

public class CarSalon {

  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    System.out.print("Car price: ");
    int carPrice = scanner.nextInt();
    
    if (carPrice <= 12000) {
      System.out.println("Yes!");
      
    }
  }
}
