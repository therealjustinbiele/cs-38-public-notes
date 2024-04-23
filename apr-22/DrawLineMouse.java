
public class DrawLineMouse
{
    public static void main(String[] args)
    {
        Draw screen = new Draw();
        
        int index = 0;
        
        double[] x1 = new double[50];
        double[] y1 = new double[50];
        double x = 0;
        double y = 0;

        do
        {
            screen.pause(100);
            if (screen.isMousePressed())
            {
                x = screen.mouseX();
                y = screen.mouseY();
                System.out.printf("%d: %.2f, %.2f\n", x, y);

                // get previous indexes
                double prevX = x1[index];
                double prevY = y1[index];

                // draw the line
                screen.line(prevX, prevY, x, y);

                // Add x and y to the x1 and y1 arrays
                x1[index] = x;
                y1[index] = y;

                // increment array indexes
                index++;
            }
        } while (x < 0.95 && y < 0.95);
        System.out.println("\n Program exited");
    }
}
