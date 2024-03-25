# CS-38 Java
> March 25, 2024

## Classes and Objects

[Intro video](https://ivc-new.instructure.com/courses/9804/pages/section-6-dot-1-objects-and-classes?module_item_id=725081)

#### UML Diagram
UML diagram is meant to visualize the anatomy of a class. Used for planning, designing etc.
```
| Class Name |
|------------|
|   Fields   |
|------------|
|   Methods  |
|------------|
```
see Slide 8-10

Here's an example of a UML diagram for a Java class Rectangle

```
|    Rectangle          |
|-----------------------|
|   int width           |
|   int height          |
|-----------------------|
|     Methods           |
|   setWidth(int w)     |
|   setHeight(int h)    |
|    getWidth           |
|    getHeight          |
|-----------------------|
```

### Constructors
Take a look at this example:
```java
// Rectangle.java
public class Rectangle
{
    public Rectangle()
    {
        // Notice this method has the same name as the class
        // this is a constructor
    }
}
```

The Rectangle method is technically called the "constructor". The constructor is the method that "instantiates" the class, creates an "instance" of a Rectangle class.
This constructor method is executed when instantiating a Rectangle object:
`Rectangle myShape = new Rectangle();`

Take a look at this class definition
```java

public class Rectangle //pg 367
{
    private double length;
    private double width;
    // private double area; //QQQ
    
    /**
    Constructor
    @param len The length of the rectangle.
    @param w The width of the rectangle.
     */

    public Rectangle(double len, double w)
    {
        length = len;
        width = w;
    }

    /**
    The setLength method stores a value in the
    length field.
    @param len The value to store in length.
     */

    public void setLength(double len)
    {
        length = len;
    }

    /**
    The setWidth method stores a value in the
    width field.
    @param w The value to store in width.
     */

    public void setWidth(double w)
    {
        width = w;
    }

    /**
    The getLength method returns a Rectangle
    object's length.
    @return The value in the length field.
     */

    public double getLength()
    {
        return length;
    }

    /**
    The getWidth method returns a Rectangle
    object's width.
    @return The value in the width field.
     */

    public double getWidth()
    {
        return width;
    }

    /**
    The getArea method returns a Rectangle
    object's area.
    @return The product of length times width.
     */

    public double getArea()
    {
        return length * width;
    }
}
```