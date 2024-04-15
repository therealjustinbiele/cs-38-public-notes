
/**
 * Write a description of class Polygon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Flag
{
    public static void main(String[] args)
    {
        Draw win = new Draw();
        win.clear(Draw.LIGHT_GRAY);

        win.setPenColor(Draw.BLUE);
        win.filledRectangle(0.5, 0.5, 0.2, 0.2);
        
    }
}
