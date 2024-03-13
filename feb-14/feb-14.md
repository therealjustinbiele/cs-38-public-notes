# CS-38
> Feb 12, 2024

## Logical Operators

```java
public static void logicalAnd()
{
    double salary;
    double yearsOnJob;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter you annual salary: ");
    salary = keyboard.nextInt()
}
```

## Generating a random number

```java

import java.util.Random;

Random rnd = new Random();
rnd.nextInt();
// rnd.nextInt()
// 2003938237   (int)

rnd.nextInt(5)
// 0 - 4

5 + rnd.nextInt(5)
// 5 - 10
int min = 5, max = 7;
min + rnd.nextInt(max - min + 1)
```

