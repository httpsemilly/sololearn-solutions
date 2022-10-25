// You're a tour manager and need a program that will identify small countries.
// A country is considered small if its population is under 10000 and its area is under 10000 hectares.
// Create a program that takes population and area as input, then output "small country" if both conditions are met.

import java.util.Scanner;

class public LogicalStats {

  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    System.out.print("Population: ");
    int population = scanner.nextInt();
    System.out.print("Area: ");
    int area = scanner.nextInt();
    
    if (population < 10000 && area < 10000) {
      System.out.println("Small country!");
    }
  }
}
