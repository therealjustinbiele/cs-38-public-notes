# CS38
> Jan 24, 2024

## Identifiers
programmer-defined names for:
- classes
- variables
- methods

Identifiers may not be any of the Java reserved keywords, no spaces. eg `int void public` etc...

```java
public static void main(String[] args) 
{
    int checking = 42;
    byte miles = 0.4324;
    short minutes = 9;
    long days
}
```

**Allowed**
Legal variable naming pattern:
```
checking
_checking
checkingAccount
_checkingAccount
checking_account
```

**Not Allowed**
reserved keywords in Java are not allowed in variable names:
```
- abstract
- assert
- boolean
- break
- byte
- case
- catch
- char
- class
- const
- continue
- default
- do
- double
- else
- enum
- extends
- false
- final
- finally
- float
- for
- goto
- if
- implements
- import
- instanceof
- int
- interface
- long
- native
- new
- null
- package
- private
- protected
- public
- return
- short
- static
- strictfp
- super
- switch
- synchronized
- this
- throw
- throws
- transient
- true
- try
- void
- volatile
- while
- 45
```


### Boilerplate for every Java program

This syntax is **REQUIRED** for every Java program:

```java
public class ClassName
{
    public static void main(String[] args)
    {
        
    }
}
```

More Resources in the book [here](https://ivc-new.instructure.com/courses/9804/pages/chapter-2-reading-materials?module_item_id=698843)


## Variable Declarations
```java
// Datatype VariableName;

byte inches;
int speed;
short month;
float salesCommission;
double distance;
```

## Data Types
### Primitive Data Types
see [here in the book](https://plus.pearson.com/products/1b695838-0d1f-435a-ba77-95e471789145/pages/urn:pearson:entity:77307053-70e5-45ad-82ff-1444cdcddc44?userPreferredType=read): 
- byte
- short
- int
- long
- float
- double
- boolean
- char

Generally we will use `int`s and `double`s for the most part, but there are `byte`s and `short`s and `long`s.

## Strongly Typed
[slide reference](https://ivc-new.instructure.com/courses/9804/pages/chapter-2-reading-materials?module_item_id=698843)

> A strongly typed programming language is one in which each type of data, such as integers, characters, hexadecimals and packed decimals, is predefined as part of the programming language, and all constants or variables defined for a given program must be described with one of the data types. Certain operations might be allowable only with specific data types.

> Strongly typed programming language refers to an idea that describes the enforcement of firm restrictions on mixing different data types and values. When there is a violation, errors, also known as exceptions, occur. Strongly typed programming languages use a language compiler to enforce data typing compliance.


