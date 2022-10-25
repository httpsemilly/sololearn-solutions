/* You take a loan from a friend and need to calculate how much you will owe him after 3 months.
You are going to pay him back 10% of the remaining loan amount each month.
Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.
*/

import java.util.Scanner;

public class LoanCalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Loan amount: ");
    int loanAmount = scanner.nextInt();
    
    for (int month = 1; month <= 3; month++) {
      int payment = (loanAmount * 10) / 100;
      int remainingAmount = loanAmount - payment;
      loanAmount = remainingAmount;
    }
    
    System.out.println("The remaining amount after 3 month is " + loanAmount);
    
  }
}
