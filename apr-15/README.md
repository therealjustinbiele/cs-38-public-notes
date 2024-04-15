# CS-38
> April 15, 2024


In the Princeton Draw Java library, mouse events are handled using the Mouse class. This class provides methods to detect various mouse interactions such as clicking, dragging, moving, and releasing. Here's an overview of the main mouse events supported by the Mouse class.

These methods allow you to easily detect and respond to mouse events within your graphical applications. You can use them to create interactive elements such as buttons, sliders, drag-and-drop functionality, and more. These methods exist on the Draw instance you create, so `screen.mouseX()` or `screen.isClicked()`.

**Mouse Clicks:**

- isPressed(): Returns true if the mouse button is currently pressed.
- isPressed(int button): Returns true if the specified mouse button is currently pressed.
- isClicked(): Returns true if the mouse button was clicked since the last call to isClicked() or clearClicked().
- isClicked(int button): Returns true if the specified mouse button was clicked.
- clearClicked(): Clears the clicked state of the mouse.

**Mouse Position:**

- getX(): Returns the x-coordinate of the mouse cursor relative to the canvas.
- getY(): Returns the y-coordinate of the mouse cursor relative to the canvas.

**Mouse Motion:**

- getDX(): Returns the change in the x-coordinate of the mouse since the last call to getDX() or clearMotion().
- getDY(): Returns the change in the y-coordinate of the mouse since the last call to getDY() or clearMotion().
- clearMotion(): Clears the motion state of the mouse.

**Mouse Dragging:**

- isDragged(): Returns true if the mouse is currently being dragged (moved while a button is pressed).
- isDragged(int button): Returns true if the specified mouse button is currently being dragged.
- isDragged(int button, int modifiers): Returns true if the specified mouse button with the specified modifiers is currently being dragged.

**Mouse Release:**

- isReleased(): Returns true if the mouse button was released since the last call to isReleased() or clearReleased().
- isReleased(int button): Returns true if the specified mouse button was released.
- clearReleased(): Clears the released state of the mouse.
