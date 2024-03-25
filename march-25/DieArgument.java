/**
   This program rolls a 6-sided die and
   a 20-sided die.
*/

public class DieArgument
{
   public static void main(String[] args)
   {
      Draw screen = new Draw();
      final int SIX_SIDES = 6;
      final int TWENTY_SIDES = 20;
      
      // Create a 6-sided die.
      Die sixDie = new Die(SIX_SIDES);
      
      // Create a 20-sided die.
      Die twentyDie = new Die(TWENTY_SIDES);
      
      // Roll the dice.
      rollDie(sixDie);
      rollDie(twentyDie);

      for (int i = 0; i < 10; i++)
      {
         rollDie(sixDie);
         rollDie(twentyDie);
         int d6, d20;
         d6 = sixDie.getValue();
         d20 = twentyDie.getValue();
      }
      screen.text(0.5, 0.3, sixDie.getValue());
      screen.text(0.5, 0.8, twentyDie.getValue());
   }
   
   /**
      This method simulates a die roll, displaying
      the die's number of sides and value.
      @param d The Die object to roll.
   */
   
   public static void rollDie(Die d)
   {
      // Display the number of sides.
      System.out.println("Rolling a " + d.getSides() + 
                         " sided die.");
      
      // Roll the die.
      d.roll();
      
      // Display the die's value.
      System.out.println("The die's value: " + d.getValue());
   }
}