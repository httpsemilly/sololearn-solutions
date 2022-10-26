// You are an assistant on a TV show where celebrities are dancing and 4 judges evaluate their performance and give them a score between 1 and 10.
// Write a program that takes the scores as input, then create a method to take them as parameters, calculate and return the average score.

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
      System.out.print("First score: ");
      double score1 = read.nextDouble();
      System.out.print("Second score: ");
      double score2 = read.nextDouble();
      System.out.print("Third score: ");
      double score3 = read.nextDouble();
      System.out.print("Fourth score: ");
      double score4 = read.nextDouble();
      double avgScore = getAverageScore(score1, score2, score3, score4);
    
      System.out.println("The average score is: " + avgScore);
    
   }
   
   public static double getAverageScore(double scr1, double scr2, double scr3, double scr4) {
      return (scr1 + scr2 + scr3 + scr4) / 4;
   }
}
