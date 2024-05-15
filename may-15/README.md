## Comparison Operators
   - For primitive data types like `int`, `double`, `float`, etc., you can use relational operators (`<`, `<=`, `>`, `>=`, `==`, `!=`) to compare them.
   - Remember that you should use caution when comparing floating-point numbers like `double` and `float` due to potential precision issues with floating-point arithmetic.

## Comparing Strings in Java

```java
String city1 = "irvine";
String city2 = city1.toLowerCase();
city1 == city2 // evaluates false
```

The proper way to compare two strings in this case, we would use the `.equals()` method.


```java
String city1 = "irvine";
String city2 = city1.toLowerCase();
city1 = city1.toLowerCase();
city1.equals(city2); // evaluates true
```

## Comparing Doubles in Java

```java
double num1 = 0.30;
double num2 = 0.20 + 0.10;
num1 == num2 // evaluates false

// num1 === 0.30
// num2 == 0.30000000000004
```


## ChatGPT notes

> write me some notes about comparing different data types in java? comparing doubles, Strings, and objects etc.

Sure, here are some notes on comparing different data types in Java:

1. **Primitive Data Types:**
   - For primitive data types like `int`, `double`, `float`, etc., you can use relational operators (`<`, `<=`, `>`, `>=`, `==`, `!=`) to compare them.
   - Remember that you should use caution when comparing floating-point numbers like `double` and `float` due to potential precision issues with floating-point arithmetic.

2. **Comparing Doubles:**
   - When comparing `double` values, it's advisable to use the `Double.compare(double d1, double d2)` method or compare them within a tolerance range to account for floating-point arithmetic errors.
   - Example:
     ```java
     double a = 0.1;
     double b = 0.2;
     double epsilon = 0.0001; // tolerance level
     if (Math.abs(a - b) < epsilon) {
         System.out.println("a and b are approximately equal");
     }
     ```

3. **Comparing Strings:**
   - Use the `equals()` method or `compareTo()` method for comparing strings.
   - The `equals()` method checks whether two strings have the same sequence of characters.
   - The `compareTo()` method compares strings lexicographically.
   - Example:
     ```java
     String str1 = "hello";
     String str2 = "hello";
     if (str1.equals(str2)) {
         System.out.println("Strings are equal");
     }
     ```

4. **Comparing Objects:**
   - For objects, you should override the `equals()` method to define what it means for two objects to be "equal".
   - It's also recommended to override the `hashCode()` method whenever you override `equals()` to maintain the contract between `equals()` and `hashCode()`.
   - Example:
     ```java
     public class MyClass {
         private int id;
         private String name;
         
         // Constructor and other methods here

         @Override
         public boolean equals(Object o) {
             if (this == o) return true;
             if (o == null || getClass() != o.getClass()) return false;
             MyClass myClass = (MyClass) o;
             return id == myClass.id && Objects.equals(name, myClass.name);
         }

         @Override
         public int hashCode() {
             return Objects.hash(id, name);
         }
     }
     ```

5. **Comparing Object References:**
   - The `==` operator in Java compares object references, not the actual contents of objects.
   - Use `equals()` method for content comparison, `==` only for reference comparison.
   - Example:
     ```java
     String str1 = new String("hello");
     String str2 = new String("hello");
     if (str1 == str2) {
         System.out.println("References are the same");
     }
     if (str1.equals(str2)) {
         System.out.println("Contents are the same");
     }
     ```

These are some basics to consider when comparing different data types in Java. Remember to handle each data type according to its characteristics and requirements.