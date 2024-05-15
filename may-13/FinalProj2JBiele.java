
/**
 * Write a description of class PA_Project1YN here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Font; 
import java.util.Scanner; 
import java.util.Random;
public class FinalProj2JBiele
{
    static Draw scrYI = new Draw();
    public static void testGraphicsLib()
    {
        Scanner input = new Scanner(System.in);
        String xyz = new String("");
        char key;
        int keyValue;

        System.out.println("Move cursor inside the graphics screen ");
        System.out.println("and press any key to draw a box");
        while(scrYI.hasNextKeyTyped()==false) {}
        key = scrYI.nextKeyTyped();
        keyValue = key;
        System.out.println("You typed "+key);

        scrYI.square(0.5, 0.5, 0.2);
        scrYI.pause(1000);

        System.out.print("Press ENTER to draw a large text");
        xyz = input.nextLine();
        scrYI.setPenColor(Draw.GREEN);
        scrYI.filledSquare(0.5, 0.5, 0.1);
        scrYI.pause(1000);

        System.out.print("Press ENTER to draw a large text");
        xyz = input.nextLine();
        scrYI.setPenColor(Draw.YELLOW);
        scrYI.filledCircle(0.5, 0.5, 0.08);

        System.out.print("Press ENTER to draw a large text");
        xyz = input.nextLine();
        scrYI.setPenColor(Draw.BLACK);
        scrYI.line(0.8,0.9,  0.9,0.2);

        scrYI.setPenColor(Draw.BLACK);
        scrYI.text(0.2, 0.5, "black text");
        scrYI.pause(1000);

        scrYI.clear();
        System.out.print("Press ENTER to draw a large text");
        xyz = input.nextLine();
        Font fnt = new Font("Arial", Font.BOLD, 64);
        scrYI.setFont( fnt );
        scrYI.setPenColor(Draw.BLUE);
        scrYI.pause(3000);
        scrYI.text(0.3, 0.9, "blue text");

        System.out.println("Move cursor inside the graphics screen and press any key to draw an arc");
        while(scrYI.hasNextKeyTyped()==false) {}
        key = scrYI.nextKeyTyped();
        keyValue = key;
        System.out.println("You typed "+key);

        scrYI.setPenColor(Draw.BOOK_RED);
        scrYI.setPenRadius(0.02);
        scrYI.arc(0.8, 0.2, 0.1, 90, -90);

        System.out.println("Press Enter to draw a diamond");
        xyz = input.nextLine();
        System.out.println("You typed "+key);
        scrYI.setPenRadius();
        scrYI.setPenColor(Draw.BOOK_BLUE);
        double[] x = { 0.2, 0.3, 0.4, 0.3 };
        double[] y = { 0.2, 0.3, 0.2, 0.1 };
        scrYI.filledPolygon(x, y);

        System.out.print("Press ENTER to draw Pi");
        xyz = input.nextLine();
        fnt = new Font("Arial", Font.BOLD, 24);
        scrYI.setFont( fnt );
        scrYI.setPenColor(Draw.BLUE);
        String pi = String.format("%.2f",Math.PI);
        scrYI.text(0.05, 0.8, pi);

        fnt = new Font("Arial", Font.BOLD, 36);
        scrYI.setFont( fnt );
        scrYI.setPenColor(Draw.GRAY);
        pi = String.format("%.3f",Math.PI);
        scrYI.text(0.25, 0.8, pi);

        fnt = new Font("Arial", Font.BOLD, 48);
        scrYI.setFont( fnt );
        scrYI.setPenColor(Draw.RED);
        pi = String.format("%.4f",Math.PI);
        scrYI.text(0.60, 0.8, pi);

        //Change the code to draw your name inside a box and circle
        scrYI.setPenColor(Draw.BLUE);
        scrYI.setPenRadius(0.01);
        scrYI.rectangle(0.50, 0.50, 0.25,0.125);
        scrYI.setPenColor(Draw.BLACK);
        //scrYI.filledRectangle(0.50, 0.50, 0.25,0.125);

        fnt = new Font("Arial", Font.BOLD, 32);
        scrYI.setFont( fnt );

        scrYI.setPenColor(Draw.BLACK);
        scrYI.text(0.50, 0.50, "Your Name");
    }

    public static void studentAdditions()
    {
        scrYI.setPenColor(Draw.BLUE);
        scrYI.setPenRadius(0.01);
        scrYI.rectangle(0.50, 0.50, 0.25,0.125);
        scrYI.setPenColor(Draw.BLACK);
        //scrYI.filledRectangle(0.50, 0.50, 0.25,0.125);

        Font fnt = new Font("Arial", Font.BOLD, 32);
        scrYI.setFont( fnt );

        scrYI.setPenColor(Draw.BLACK);
        scrYI.text(0.50, 0.50, "Your Name");
    }

    public static void key3()
    {
        char key = '0';
        int value;
        while(key != 'Q')  
        {
            if(scrYI.hasNextKeyTyped())
            {
                key = scrYI.nextKeyTyped();
                value = key;
                System.out.println("key:["+key+"]="+value);
            } 
            scrYI.pause(200); 
        }
    }

}
