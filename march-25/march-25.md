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
