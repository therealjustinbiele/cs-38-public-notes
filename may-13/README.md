**Non-static private fields:**
   - These are instance variables. Each instance of the class has its own copy of these variables.
   - Non-static private fields are declared without the `static` keyword.
   - They are accessed using an instance of the class, meaning you need to create an object of the class to access these variables.
   - They are typically used to store data that is unique to each object (instance) of the class.

```java
public class MyClass {
    private int nonStaticField;

    public void setNonStaticField(int value) {
        nonStaticField = value;
    }

    public int getNonStaticField() {
        return nonStaticField;
    }
}
```

Usage of non-static private fields:

```java
MyClass obj1 = new MyClass();
obj1.setNonStaticField(10);

MyClass obj2 = new MyClass();
obj2.setNonStaticField(20);

System.out.println(obj1.getNonStaticField()); // Output: 10
System.out.println(obj2.getNonStaticField()); // Output: 20
```

2. **Static private fields:**
   - These are class-level variables. They are shared among all instances of the class.
   - Static private fields are declared with the `static` keyword.
   - They are accessed using the class name itself, without needing to create an instance of the class.
   - They are typically used to store data that is common to all objects of the class.

```java
public class MyClass {
    private static int staticField;

    public void setStaticField(int value) {
        MyClass.staticField = value;
    }

    public int getStaticField() {
        return staticField;
    }
}
```

Usage of static private fields:

```java
MyClass obj1 = new MyClass();
obj1.setStaticField(10);

MyClass obj2 = new MyClass();
obj2.setStaticField(20);

System.out.println(obj1.getStaticField()); // Output: 20
System.out.println(obj2.getStaticField()); // Output: 20
```

Sure, here are the examples provided in Java:

1. **Pass by value:**
```java
public class PassByValueExample {
    public static void main(String[] args) {
        int x = 10;
        modifyValue(x);
        System.out.println(x); // Output: 10
    }

    public static void modifyValue(int value) {
        value = 20;
    }
}
```

2. **Pass by reference:**
In Java, pass by reference isn't supported directly. However, you can achieve similar behavior by passing objects, as they are passed by value (the value being the reference to the object).

```java
import java.util.ArrayList;

public class PassByReferenceExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        modifyList(list);
        
        System.out.println(list); // Output: [1, 2, 3, 4]
    }

    public static void modifyList(ArrayList<Integer> list) {
        list.add(4);
    }
}
```

In this example, we're passing an `ArrayList` object to the `modifyList` method. Changes made to the `list` object within the method are reflected in the original object outside of the method because the reference to the object is passed by value.