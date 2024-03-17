# CS38
> Justin Biele
> March 13, 2024

# Objects in Java
Create a new Object in Java by declaring a class
```java
public class Rectangle
{
    // fields
    // constructor

    // setter methods (mutator)
    // getter methods (accessor)
}
```

Ask yourself, what defines a rectangle?
It has a height and a width...

so:
```java
public class Rectangle
{
    // fields
+   private double length;
+   private double width;
    
    // constructor

    // setter methods (mutator)
    // getter methods (accessor)
}
```

What else does it have?
Perhaps X and Y coordinates!
```java
public class Rectangle
{
    // fields
    private double length;
    private double width;
+   private double xCoord;
+   private double yCoord;

    // constructor

    // setter methods (mutator)
    // getter methods (accessor)
}
```

Mutator methods will change the fields (members) of the class

```java
public class Rectangle
{
    // fields
    private double length;
    private double width;
    private double xCoord;
    private double yCoord;

    // constructor

    // setter methods (mutator)
    // mutator methods take in new values
    public void setLength(double newLength)
    {
        length = newLength;
    }

    public void setWidth(double newWidth)
    {
        width = newWidth;
    }
    
    // getter methods (accessor)
    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }
}
```