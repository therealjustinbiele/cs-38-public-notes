
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
        balance = 0.0;
    }

    public BankAccount(double bal)
    {
        balance = bal;
    }

    public double getBalance()
    {
        return balance;
    }
}
