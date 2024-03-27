import java.util.Scanner;

public class OverloadedMethods
{
    public static int add(int num1, int num2)
    {
        System.out.println("running the first add method");
        return num1 + num2;
    }

    public static double add(double num1, double num2)
    {
        System.out.println("running the second add method");
        return num1 + num2;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter two integers (eg. 8 11): ");
        double numA = keyboard.nextDouble();
        double numB = keyboard.nextDouble();
        add(numA, numB);
        
        System.out.print("Please enter two more integers (eg. 8 11): ");
        int numC = keyboard.nextInt();
        double numD = keyboard.nextDouble();
        add(numC, numD);
    }
}
