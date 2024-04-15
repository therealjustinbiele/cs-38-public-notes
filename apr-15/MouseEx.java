import java.util.Random;

public class MouseEx
{
    public static void main(String[] args)
    {
        mouse1();
    }

    public static void mouse1()
    {
        Draw screen = new Draw();
        double x = 0;
        double y;
        int count = 0;
        while (x < 0.99)
        {
            screen.pause(100);
            if (screen.isMousePressed())
            {
                System.out.printf("Mouse is being clicked...");
                x = screen.mouseX();
                y = screen.mouseY();
                Random random = new Random();
                int r, g, b;
                r = random.nextInt(256);
                g = random.nextInt(256);
                b = random.nextInt(256);

                screen.setPenColor(r, g, b);
                screen.filledCircle(x, y, 0.05);
                System.out.printf("%d: x: %.3f, y: %.3f \n", count, x, y);
            }
            count++;
        }
        System.out.println("\n Program exited");
    }
}
