/**
   The BankAccount class simulates a bank account.
*/

public class BankAccountJBiele
{
   private double acctBal;      // Account balance

   public BankAccountJBiele()
   {
      acctBal = 0.0;
   }

   public BankAccountJBiele(double startBalance)
   {
      acctBal = startBalance; // set acctBal to startBalance param
   }

   public void deposit(double amount)
   {
      acctBal = acctBal + amount; // set acctBal to itself + the amount
   }

   public void withdraw(double amount)
   {
      acctBal = acctBal - amount; // set acctBal to itself - the amount
   }

   public double getBalance()
   {
      return acctBal; // return acctBal
   }
}