
/**
 * 
 *
*/
public class TileDemo
{
    public static void main(String[] args)
    {
        int n = 5;
        Tile[] myTiles = new Tile[n];
        Draw screen = new Draw();
        for (int i = 0; i < n; i++)
        {
            Tile each = new Tile(screen, 0.1 * i, 0.1, 0.02, 0.02);
            myTiles[i] = each;
            each.drawMe();
        }
    }
}
