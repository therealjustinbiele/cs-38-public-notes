
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
