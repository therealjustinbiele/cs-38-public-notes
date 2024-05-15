import java.util.Scanner;

/**
   This program demonstrates how a method
   can return a reference to an object.
*/

public class ReturnObject
{
   public static void main(String[] args)
   {
      BankAccount account;

      // Get a reference to a BankAccount object.
      account = getAccount();
      
      // Display the account's balance.
      System.out.printf("The account balance is $%,.2f\n",
                        account.getBalance());
   }

   /**
      The getAccount method creates a BankAccount object
      with the balance specified by the user.
      @return A reference to the object.
   */
   
   public static BankAccount getAccount()
   {
      double balance; // Account balance
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the balance from the user.
      System.out.print("Enter the account balance: ");
      balance = keyboard.nextDouble();
      
      // Create a BankAccount object and return
      // a reference to it.
      return new BankAccount(balance);
   }
}