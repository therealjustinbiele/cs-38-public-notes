
/**
 * Write a description of class Polygon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Polygon
{
    public static void main(String[] args)
    {
        Draw win = new Draw();
        win.clear(Draw.LIGHT_GRAY);
        double[  ] x = { 0.10, 0.20,  0.30};
        double[  ] y = { 0.20, 0.50, 0.20 };
        win.filledPolygon(x,y);

        win.setPenColor(Draw.YELLOW);
        win.filledPolygon(x,y);
        double[  ] x1 = { 0.60,  0.65,  0.80, 0.90};
        double[  ] y1 = { 0.20,  0.50,  0.45, 0.20};
        win.setPenColor(Draw.RED);
        win.filledPolygon(x1,y1);
        
        win.setPenColor(Draw.BLUE);
        win.filledRectangle(0.5, 0.5, 0.2, 0.2);
        
    }
}
