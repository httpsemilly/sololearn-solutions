// Tom and Bob are playing a board game, in which both players start with the same number of points. 
// Tom won the first game and got 1 point, while Bob lost the game, and therefore lost 1 point.

import java.util.Scanner;

public class IncrementAndDecrement {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Initial score: ");
    int initialScore = scanner.nextInt();
    
    int tomScore = initialScore;
    int bobScore = initialScore;
    
    System.out.println("Round 1 results:");
    System.out.println("Tom: " + ++tomScore);
    System.out.println("Bob: " + --bobScore);
    
  }
}
