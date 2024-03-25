import java.util.Random;

/**
   The Die class simulates a six-sided die.
*/

public class DieJBiele //pg 376
{
   private int sides;   // Number of sides
   private int value;   // The die's value
   
   /**
      The constructor performs an initial
      roll of the die.
      @param numSides The number of sides for this die.
   */
   
   public DieJBiele(int numSides)
   {
      sides = numSides;
   }
   
   /**
      The roll method simlates the rolling of
      the die.
   */
   
   public void roll()
   {
      // Create a Random object.
      Random rand = new Random();
      int newValue = rand.nextInt(getSides());
      
      // Get a random value for the die.
      value = newValue;
   }
   
   /**
      getSides method
      @return The number of sides for this die.
   */
   
   public int getSides()
   {
      return sides;
   }
   
   /**
      getValue method
      @return The value of the die.
   */
   
   public int getValue()
   {
      return value;
   }
}