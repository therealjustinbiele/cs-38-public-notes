# CS-38
> April 15, 2024

# Arrays
Let's break down the line 
`BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];`

`BankAccount[] accounts`: This declares a variable named accounts that can hold an array of BankAccount objects. The [] indicates that it's an array of BankAccount objects.

`new BankAccount[NUM_ACCOUNTS]`: This part of the line creates a new array of BankAccount objects with a length specified by NUM_ACCOUNTS. NUM_ACCOUNTS is a constant variable declared earlier in the code, which is set to 3. So, this part of the line essentially creates an array capable of holding 3 BankAccount objects.

So, in summary, this line is creating an array named accounts that can hold references to BankAccount objects, and it's initializing it to be an array with a length of 3. It's not a constructor for BankAccount; rather, it's creating an array capable of holding instances of the BankAccount class. Later in the code, each element of this array will be initialized with a new BankAccount object.

# Draw Notes
In the Princeton Draw Java library, mouse events are handled using the Mouse class. This class provides methods to detect various mouse interactions such as clicking, dragging, moving, and releasing. Here's an overview of the main mouse events supported by the Mouse class.

These methods allow you to easily detect and respond to mouse events within your graphical applications. You can use them to create interactive elements such as buttons, sliders, drag-and-drop functionality, and more. These methods exist on the Draw instance you create, so `screen.mouseX()` or `screen.isClicked()`.

**Mouse Clicks:**

- `isPressed()`: Returns true if the mouse button is currently pressed.
- `isPressed(int button)`: Returns true if the specified mouse button is currently pressed.
- `isClicked()`: Returns true if the mouse button was clicked since the last call to isClicked() or clearClicked().
- `isClicked(int button)`: Returns true if the specified mouse button was clicked.
- `clearClicked()`: Clears the clicked state of the mouse.

**Mouse Position:**

- `getX()`: Returns the x-coordinate of the mouse cursor relative to the canvas.
- `getY()`: Returns the y-coordinate of the mouse cursor relative to the canvas.

**Mouse Motion:**

- `getDX()`: Returns the change in the x-coordinate of the mouse since the last call to getDX() or clearMotion().
- `getDY()`: Returns the change in the y-coordinate of the mouse since the last call to getDY() or clearMotion().
- `clearMotion()`: Clears the motion state of the mouse.

**Mouse Dragging:**

- `isDragged()`: Returns true if the mouse is currently being dragged (moved while a button is pressed).
- `isDragged(int button)`: Returns true if the specified mouse button is currently being dragged.
- `isDragged(int button, int modifiers)`: Returns true if the specified mouse button with the specified modifiers is currently being dragged.

**Mouse Release:**

- `isReleased()`: Returns true if the mouse button was released since the last call to isReleased() or clearReleased().
- `isReleased(int button)`: Returns true if the specified mouse button was released.
- `clearReleased()`: Clears the released state of the mouse.

```java
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
        while (x < 10000)
        {
            screen.pause(500);
            x = screen.mouseX();
            y = screen.mouseY();
            System.out.printf("%d: x: %.3f, y: %.3f \n", count, x, y);
            count++;
        }
        System.out.println("\n Program exited");
    }
}
```

