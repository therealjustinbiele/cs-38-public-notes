import java.util.Scanner;

/**
   This program demonstrates the Metric class.
*/

public class MetricDemo
{
   public static void main(String[] args)
   {
      double miles, kilometers;    
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a distance in miles.
      System.out.print("Enter a distance in miles: ");
      miles = keyboard.nextDouble();

      // Convert the distance to kilometers.
      kilometers = Metric.milesToKilometers(miles);
      System.out.printf("%,.2f miles equals %,.2f kilometers.\n",
                        miles, kilometers);

      // Get a distance in kilometers.
      System.out.print("Enter a distance in kilometers: ");
      kilometers = keyboard.nextDouble();

      // Convert the distance to kilometers.
      miles = Metric.kilometersToMiles(kilometers);
      System.out.printf("%,.2f kilometers equals %,.2f miles.\n",
                        kilometers, miles);
   }
}
