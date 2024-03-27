# CS-38 Java
> March 27, 2024

## Overloading methods in Java
In Java, method overloading refers to the ability to define multiple methods within the same class that have the same name but different parameter lists. This allows you to create methods with the same name that perform similar tasks but operate on different types of data or accept different numbers of arguments.

**Example**
```java
public class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}
```

In this example, the MathOperations class contains three methods named add, but each add method has a different parameter list. This is method overloading.

When you call the add method, Java determines which version of the method to execute based on the number and types of arguments passed to it. For example:

```java
public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        int sum1 = math.add(5, 10);            // Calls the first add method
        int sum2 = math.add(5, 10, 15);        // Calls the second add method
        double sum3 = math.add(2.5, 3.5);      // Calls the third add method

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}
```

In this example, depending on the arguments passed, Java will determine which version of the add method to invoke. This flexibility allows you to write cleaner and more readable code by reusing method names for similar operations.

[Overloading Methods Class Example](./OverloadedMethods.java)

### Testing A Class

1. Create several objects from the class
`ObjectType myNewObj1 = new ObjectType();`
`ObjectType myNewObj2 = new ObjectType();`
`ObjectType myNewObj3 = new ObjectType();`

2. Call methods from the class to check if they are written correctly.

```java

public class TesterJBiele
{
    public static void main(String[] args)
    {
        HourlyWorker w1 = new HourlyWorker("Todd", 20.00);
        HourlyWorker w2 = new HourlyWorker("Susan", 25.00);
    }
}

```