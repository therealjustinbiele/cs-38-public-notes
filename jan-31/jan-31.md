# CS38
> Jan 31, 2024

## EXAM:
- go through textbook, answer the practice questions
- focus is on **_CHAPTER 2_**
- [homework](https://ivc-new.instructure.com/courses/9804/assignments/256144?module_item_id=711213) to help:
    - do the odd numbers of chapter 2: Java Fundamentals
    - not graded
    - skip what you don't know
- practice graphics (make the French flag)
- using a scantron

```java
String name = "grandfather John";
int age = 23;
age +4
27   (int)
age /3
7   (int)
name.length();
name.length();
name.length()
16   (int)
name.substring(1, 4)
"ran"   (String)
name.substring(1, 8)
"randfat"   (String)
name.substring(2, 5)
"and"   (String)
name.substring(2, 3)
"a"   (String)
name.substring(2, 4)
"an"   (String)
String name2 = "Sailor Teddy!"
Error: ';' expected
String name2 = "Sailor Teddy!";
name2.substring(4, 6);
name2.substring(4, 6)
"or"   (String)
name2.substring(8, 10)
"ed"   (String)
name2.substring(8, 12)
"eddy"   (String)
name2.substring(8)
"eddy!"   (String)
```

## String Methods

- **`.toUpperCase()`**
returns a _new_ string with the letters capitalized

- **`.toLowerCase()`**
returns a _new_ string with the letters lowercased

- **`.length()`**
returns the length of the string

- **`.substring(startIndex, endIndex)`**
returns a _new_ string whose value is the substring of the original string
- **`.charAt(index)`**
finds the index of the first instance of that character
- **`.indexOf`**
gives the index of where the given substring begins. returns `-1` if the given substring does not exist in the string

## Scope
Page 83 of the textbook
[Slide 92](https://ivc-new.instructure.com/courses/9804/pages/chapter-2-reading-materials?module_item_id=698843)

Variable being accessed before its been initialized:
```java
public class Scope
{
    public static void main(String[] args)
    {
        System.out.println(value); // ERROR!
        int value = 100;
    }
}
```

## Comments
[Slide 96](https://ivc-new.instructure.com/courses/9804/pages/chapter-2-reading-materials?module_item_id=698843)
```java
/**
 * 
 * Comments are omitted from the execution
 * 
 */
```