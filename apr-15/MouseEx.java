
public class MouseEx
{
    public static void main(String[] args)
    {
        mouse1();
    }

    public static void mouse1()
    {
        Draw screen = new Draw();
        double x, y;
        for (int count = 0; count < 20; count++)
        {
            screen.pause(500);
            x = screen.mouseX();
            y = screen.mouseY();
            System.out.println(String.format("x: %.3f, y: %.3f", x, y));
        }
    }
}
