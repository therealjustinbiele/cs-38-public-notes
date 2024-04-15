
/**
 * Write a description of class Tile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tile
{
    //fields
    static private Draw scr;
    private double x;
    private double y;
    private double width;
    private double height;
    /**
     * Constructor for objects of class Tile
     */
    public Tile(Draw win, double x1, double y1, double w1, double h1)
    {
        scr = win;
        x = x1; 
        y = y1;
        width = w1;
        height = h1;
    }
    
    public void drawMe( )
    {
        scr.filledRectangle(x, y, width, height);
    }

}
