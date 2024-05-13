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