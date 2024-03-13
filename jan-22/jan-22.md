# CS38
> Jan 22, 2024

## Java Programming

```java
public class Simple
{
   public static void main(String[] args)
   {
      System.out.println("Programming is great fun!");
   }
}
```

Write a class of your own!

```java

public class Simple
{
   public static void main(String[] args)
   {
      System.out.println("Hello!");
   }

   public static void sayHello()
   {
      System.out.println("Hello World! My name is JB!");
   }

   public static void draw()
   {
      Draw screen = new Draw();
      screen.clear(Draw.CYAN);
      screen.setTitle("Hello");
      screen.text(0.15, 0.90, "My name is JB");
   }
}
```

## Special Characters
- `//` double slash Marks the beginning of a single line
comment.
- `( )` open and close
parenthesis
Used in a method header to mark the
parameter list.
- `{ }` open and close curly
braces
Encloses a group of statements, such
as the contents of a class or a
method.
- `" "` quotation marks
Encloses a string of characters, such
as a message that is to be printed on
the screen
- `;` semi-colon Marks the end of a complete
programming statement

### Print Formatting

**Unruly**
```java
public class Unruly
{
    public static void main(String[] args)
    {
        System.out.print("These are our top sellers:");
        System.out.print("Computer games");
        System.out.print("Coffee");
        System.out.println("Aspirin");
    }
}
```

**Adjusted**
```java
// A well adjusted printing program
public class Adjusted
{
   public static void main(String[] args)
   {
      System.out.print("These are our top sellers:\n");
      System.out.print("Computer games\nCoffee\n");
      System.out.println("Aspirin");
   }
}
```

**Tabs**
```java
// Another well adjusted printing program
public class Tabs
{
   public static void main(String[] args)
   {
      System.out.print("These are our top sellers:\n");
      System.out.print("\tComputer games\n\tCoffee\n ");
      System.out.println("\tAspirin");
   }
}
```

### Variables and Memory
