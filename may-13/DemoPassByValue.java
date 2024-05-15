
public class DemoPassByValue
{
    public static void main(String[] args)
    {
        int x, y;
        x = 10;
        y = 20;
        System.out.println("x = " + x + ", y =" + y + ". These are the original values. ");
        System.out.println("Now multiply x and y by 10");
        multiplyBy10(x, y);
        System.out.println("X equals: " + x + ", and Y equals: " + y);
    }

    public static void multiplyBy10(int x, int y)
    {
        x = x * 10;
        y = y * 10;
    }
}
