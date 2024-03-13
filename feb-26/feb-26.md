# CS-38
> Feb 26, 2024

# Increment / Decrement Operator:
`++` and `--` are short-hand for adding and minusing 1 from a varaible

```java
number = number - 1;
number = number + 1;

// could be written as

number--;
number++;

// or

--number;
++number;

```

### Print statements with incrementing / decrementing operators

```java
int number = 4;
System.out.println("The number should be" + number++)
// --> will print 4

// java will not change the value until `number` until after the variable is used
```

# Loops

Different kinds of loops:
- `while`
- `do {} while()`
- `for`

Their purpose is to repeat one set of instructions many times, instead of writing duplicating code

## While loops

```java
while (/* some boolean expression */)
{
    // code to be executed so long as the while condition is true
}

while (i < 24)
{
    // System.out.println(i)
}
```

