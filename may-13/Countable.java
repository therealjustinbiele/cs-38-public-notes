/**
   This class demonstrates a static field.
*/

public class Countable
{
   private static int instanceCount = 0;
   private int num;

   /**
      The constructor increments the static
      field instanceCount. This keeps track
      of the number of instances of this
      class that are created.
   */

   public Countable()
   {
      instanceCount++;
      num += 1;
   }

   /**
      The getInstanceCount method returns
      the number of instances of this class
      that have been created.
      @return The value in the instanceCount field.
   */

   public int getInstanceCount()
   {
      return instanceCount;
   }
}