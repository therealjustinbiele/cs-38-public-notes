/**
   This program uses the Stock class's equals
   method to compare two Stock objects.
*/

public class StockCompare
{
   public static void main(String[] args)
   {
      // Create two Stock objects with the same values.
      Stock company1 = new Stock("XYZ", 9.62);
      Stock company2 = new Stock("XYZ", 9.62);
      
      // Use the equals method to compare the objects.
      if (company1.equals(company2))
         System.out.println("Both objects are the same.");
      else
         System.out.println("The objects are different.");
   }
   
   /**
    * CodePad test:
    * String city1 = "irvine";
    * String city2 = city1.toUpperCase( );
    * city1 = city1.toUpperCase( );
    * city1
    * city2
    * city1 == city2
    * city1.equals( city2 )
    */
}