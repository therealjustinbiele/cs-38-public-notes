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

