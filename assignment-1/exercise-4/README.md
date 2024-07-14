# Instructions

The file `numbers.text` contains a header value, followed by that many double values. Create an array of the appropriate size, populate the array with the doubles, and print out various information about the array (see below).

**The name of your class should be `ArrayInfo`.**

For example, if the file `numbers.text` contains:

```plaintext
8
12.3
2.5
9.4
3.14
22.15
17
54.3
7.6
```

the program should produce the following output:

```plaintext
The array: {12.3, 2.5, 9.4, 3.14, 22.15, 17.0, 54.3, 7.6} contains 8 elements
The first element of the array is 12.3
The last element of the array is 7.6 and is at position 7
The middle element of the array is 3.14 and is at position 3
The largest element of the array is 54.3 and is at position 6
The smallest element of the array is 2.5 and is at position 1
```

*Additional Notes:*
*numbers.text should not be modified.*
*Regarding your code's standard output, CodeLab will check for case errors and will check whitespace (tabs, spaces, newlines) exactly except that it will ignore all trailing whitespace.*

**Instructors Notes:**

When the length of the array is odd, it is clear what we mean by "middle element of the array." BYt if the length of the array is even, which element is considered to be the middle one? Use the sample output above to help you answer this question.