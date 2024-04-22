# CS-38
> April 22, 2024

### Testing a class
you need a few things to create an object:

- the class itself: a general description of the object
- the demo OR tester OR runner: the class that tests the original description class
    - usually you print the results of testing the original class

eg:
```java
public class Tile
{
    //fields
    static private Draw scr;
    private double x;
    private double y;
    private double width;
    private double height;

    /* Constructor */
    public Tile(Draw win, double x1, double y1, double w1, double h1)
    {
        scr = win;
        x = x1; 
        y = y1;
        width = w1;
        height = h1;
    }
    
    public void drawMe( )
    { ... }
}
```
this class defines a Tile object.

here's how we can USE that tile object in a tester class

```java
public class TileDemo
{
    public static void main(String[] args)
    {
        int n = 5;
        Tile[] myTiles = new Tile[n];
        Draw screen = new Draw();
        for (int i = 0; i < n; i++)
        {
            // Here we are creating a new Tile object by calling its "new Tile" constructor
            Tile each = new Tile(screen, 0.1 * i, 0.1, 0.02, 0.02);
            myTiles[i] = each;
            each.drawMe();
        }
    }
}
```