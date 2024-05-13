
public class KeyEvent
{
    public static void key1()
    {
        Draw myKeys = new Draw();
        char key;
        int value;
        final int RIGHT = 39;
        final int LEFT = 37;
        final int DOWN = 40;
        final int UP = 38;
        while (true)
        {
            if (myKeys.hasNextKeyTyped())
            {
                key = myKeys.nextKeyTyped();
                value = key;
                System.out.println("key: " + key + " /// Value: " + value);
                if (key == 'Q')
                {
                    break;
                }
            }

            if (myKeys.isKeyPressed(LEFT))
            {
                System.out.println("Left button clicked!");                
            }
            if (myKeys.isKeyPressed(RIGHT))
            {
                System.out.println("Right button clicked!");                
            }
            if (myKeys.isKeyPressed(UP))
            {
                System.out.println("Up button clicked!");                
            }
            if (myKeys.isKeyPressed(DOWN))
            {
                System.out.println("Down button clicked!");                
            }
            myKeys.pause(200);
        }
    }
}
