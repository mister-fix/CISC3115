# Instructions

Write a program that reads three numbers from the keyboard, and then prints out some information about the relationships between the numbers -- whether they are all equal, in ascending order, in descending order, and so on. To determine these relationships, write the following boolean-valued functions:

- boolean allAreEqual(int a, int b, int c);
- boolean twoAreEqual(int a, int b, int c); // false if all three are equal
- boolean noneAreEqual(int a, int b, int c);
- boolean areAscending(int a, int b, int c); // true if a <= b <= c
- boolean areDescending(int a, int b, int c); // true if a >= b >= c
- boolean strictlyAscending(int a, int b, int c); // true if a < b < c
- boolean strictlyDescending(int a, int b, int c); // true if a > b > c

**Try to *"talk boolean"***

**The name of your class should be `InfoOf3`**

Here is a sample execution of the program.
User input is in bold. Your program shhould replicate the prompts and output:

```plaintext
first number? 1
second number? 2
third number? 3
allAreEqual: false
twoAreEqual: false
noneAreEqual: true
areAscending: true
areDescending: false
strictlyAscending: true
strictlyDescending: false
```

*Additional notes: Regarding your code's standard output, CodeLab will check for case errors and will check whitespace (tabs, spaces, newlines) exactly except that it will ignore all trailing whitespace.*

**Instructors Notes:**

1. Instead of writing you rprgoram directly in the code area below, it may be easier to write your program in an IDE (or wherever you like to write code) and then paste it into the code area below for Codelab to test it. This applies to the three other parts of this assignment as well.
2. A better name for the twoAreEqual method is exactlyTwoAreEqual. The method should return true if exactly two of the numbers are equal. But if all three numbers are equal, the method should return false.
3. Ignore the "interactive Session" below. There's somethign wrong with the input. Use the sample above.
4. Here's an example to show what the instructions mean when they say "Try to 'talk boolean.'" Instead of writing a method like this:

```java
public static boolean allAreEqual(int a, int b, int c) {
    if (a == b && b == c) {
        return true;
    } else {
        return false;
    }
}
```

It would be better to write the method like this:

```java
public static boolean allAreEqual(int a, int b, int c) {
    return a == b && b == c;
}
```

The two versions of this method do the same thing, but the second is more concise.  
Here's an explanation fo how the second version works. `a == b && b == c` is a *boolean expression*, which means that it is a peice of code that evaluates to either the value `true` or the value `false`. When Java encounters a boolean expression, it evaluates it, thereby obtaining true or false. In this example, Java will obtain true if a, b, and c are all equal; otherwise, it will obtain false. The boolean expression is a `return` statement. So after Java obtains true or false, the method will return the value.
