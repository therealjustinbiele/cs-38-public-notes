import java.util.Scanner;

/**
   This program demonstrates the BankAccount class.
*/

public class AccountTest
{
   public static void main(String[] args)
   {
      double input;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the starting balance.
      System.out.print("Enter your starting account balance: ");
      input = keyboard.nextDouble();
      
      // Create a BankAccount object.
      BankAccount account = new BankAccount(input);

      // Get the amount of pay.
      System.out.print("How much were you paid this month? ");
      input = keyboard.nextDouble();
      
      // Deposit the user's pay into the account.
      account.deposit(input);

      // Display the new balance.
      System.out.println("Your pay has been deposited.");
      System.out.printf("Your current balance is $%,.2f\n",
                         account.getBalance());

      // Get the amount to withdraw.
      System.out.print("How much would you like to withdraw? ");
      input = keyboard.nextDouble();
      
      // Withdraw the specified amount from the account.
      account.withdraw(input);

      // Display the new balance
      System.out.printf("Now your balance is $%,.2f\n",
                        account.getBalance());
   }
}
