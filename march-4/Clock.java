/**
   This program uses nested loops to simulate a clock.
*/

public class Clock
{
   public static void main(String[] args)
   {
      Draw screen = new Draw();
      screen.clear(Draw.LIGHT_GRAY);
      // Simulate the clock.
      for (int hours = 1; hours <= 12; hours++)
      {
         for (int minutes = 0; minutes <= 59; minutes++)
         {
            for (int seconds = 0; seconds <= 59; seconds++)
            {
               screen.setPenColor(Draw.LIGHT_GRAY);
               screen.filledRectangle(0.5, 0.8, 0.5, 0.2);

               String time = String.format("%02d:%02d:%02d\n", hours, minutes, seconds);
               System.out.printf(time);
               screen.setPenColor(Draw.BLACK);
               screen.text(0.5, 0.8, time);
               screen.pause(1000);
            }
         }
      }
   }
}