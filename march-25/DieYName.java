import java.util.Random;

/**
   The Die class simulates a six-sided die.
*/

public class DieYName //pg 376
{
   private int sides;   // Number of sides
   private int value;   // The die's value
   
   /**
      The constructor performs an initial
      roll of the die.
      @param numSides The number of sides for this die.
   */
   
   public DieYName(int numSides)
   {
      //QQQ
      
   }
   
   /**
      The roll method simlates the rolling of
      the die.
   */
   
   public void roll()
   {
      // Create a Random object.
      Random rand = new Random();
      
      // Get a random value for the die.
      value = 123;
   }
   
   /**
      getSides method
      @return The number of sides for this die.
   */
   
   public int getSides()
   {
      return 123;
   }
   
   /**
      getValue method
      @return The value of the die.
   */
   
   public int getValue()
   {
      return 123;
   }
}