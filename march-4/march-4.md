### Sentinels in Java:

Sentinels in Java are special values used to indicate the end of input in situations where the length of input is not known in advance. They are commonly used in conjunction with loops to terminate input taking when a specific value is encountered.

Example:

```java
import java.util.Scanner;

public class SentinelExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers (type -1 to stop):");
        
        int sum = 0;
        int num;
        
        while ((num = scanner.nextInt()) != -1) {
            sum += num;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        scanner.close();
    }
}
```

In this example, the user can input numbers continuously until they input `-1`, which acts as the sentinel value to stop input. The program then calculates the sum of all the numbers entered.

### Accumulators in Java:

In Java, an accumulator is a variable used to accumulate or collect values during the iteration of a loop. It is commonly used to calculate totals, averages, counts, or other aggregate values.

Example:

```java
public class AccumulatorExample {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        System.out.println("Sum of numbers: " + sum);
    }
}
```

In this example, `sum` acts as the accumulator variable, which accumulates the sum of all the numbers in the `numbers` array.

### For Loops / Nested For Loops in Java:

For loops in Java are used to iterate over a range of values or elements in an array or collection. Nested for loops are for loops that are placed inside other for loops, allowing for more complex iteration patterns, such as iterating over two-dimensional arrays or performing nested iterations.

Example of a simple for loop:

```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}
```

Example of a nested for loop:

```java
public class NestedForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
```

In the nested for loop example, the outer loop iterates three times, and for each iteration of the outer loop, the inner loop iterates three times, resulting in a total of nine iterations.

# File I/O
The Java API offers several classes to facilitate reading from and writing to files. Here's a breakdown of commonly used classes for these tasks:

1. **PrintWriter**:
   - `PrintWriter` is a class used for writing formatted representations of objects to a text-output stream.
   - It provides convenient methods for writing various data types to a file, such as `println()` and `printf()`.
   - Example usage:
     ```java
     PrintWriter writer = new PrintWriter("output.txt");
     writer.println("Hello, world!");
     writer.close();
     ```

2. **FileWriter** (optional, used in conjunction with PrintWriter):
   - `FileWriter` is used to write characters to a file.
   - It is typically used in conjunction with `PrintWriter` for writing text to a file.
   - Example usage:
     ```java
     FileWriter fileWriter = new FileWriter("output.txt");
     PrintWriter writer = new PrintWriter(fileWriter);
     writer.println("Hello, world!");
     writer.close();
     ```

3. **Scanner**:
   - `Scanner` is used to parse primitives and strings from the input stream (in this case, a file).
   - It provides methods for reading various data types from a file, such as `nextInt()`, `nextLine()`, etc.
   - Example usage:
     ```java
     Scanner scanner = new Scanner(new File("input.txt"));
     while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         System.out.println(line);
     }
     scanner.close();
     ```

4. **File**:
   - `File` represents a file or directory pathname.
   - It provides methods for querying information about the file, such as existence, permissions, etc.
   - Example usage:
     ```java
     File file = new File("input.txt");
     System.out.println("File exists: " + file.exists());
     ```

Using these classes, you can easily manipulate files in Java, whether it's for reading data from them (using `Scanner` and `File`) or writing data to them (using `PrintWriter` and optionally `FileWriter`). Always remember to handle exceptions properly when working with files, as file operations can throw IOExceptions.