
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private double balance;

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount()
    {
        // initialise instance variables
        balance = 0;
    }
    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount(double bal)
    {
        // initialise instance variables
        balance = bal;
    }

    public double getBalance()
    {
        // put your code here
        return balance;
    }
}
