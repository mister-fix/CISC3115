# Instructions

The file numbers.txt consists of sequences of numbers, each sequence preceded by a header value nd then followed by that many integers. Read in the sequences and print their averages. When all sequences are read in, print out the number of sequences processed.

**The name of your class should be Averages.**

For example, if the file numbers.text contains:

```plaintext
3 1 2 3
5 12 14 6 4 0
10 1 2 3 4 5 6 7 8 9 10
1 17
2 90 80
```

the program should produce the following output:

```plaintext
The average of the 3 integers 1 2 3 is 2.0
The average of the 5 integers 12 14 5 6 0 is 7.2
The average of the 10 integers 1 2 3 4 5 6 7 8 9 10 is 5.5
The average of the 1 integers 17 is 17.0
The average of the 2 integers 90 80 is 85.0
5 sets of numbers processed
```

*Additonal notes:*
*numbers.text should not be modified.*
*Regarding your code's standard output, CodeLab will check for case errors and will check whitespace (tabs, spaces, newlines) exactly except that it will ignore all trailing whitespace.*

**Instructors Notes:**

The instructions above (which were not written by me and which I am unable to modify) contian some typos. Here are the instructions without typos:

The file numbers.text consists of sequences of numbers, each sequence prceded by a header value and then followed by that many integers. Read in the sequences and print their averages. When all sequences have been read in, print out the number of sequences processed.

More information: The file, which is called numbers.t**e**xt, not numbers.txt, contains sequences of numbers. (I don't know why Codelab decided that it should be.text and not .txt; outside of Codelab, we typically use .txt.) Immediately before each sequence, there is a number indicating the length of the sequence. For example, one line of the file might be 4 9 2 17 2. The header tells us that there are four numbers in this sequence, and the four numbers are 9, 2, 17, and 2. The file contains many lines like this. We do not know ahead of time how many lines will be in the file.

Hint: You should probably use a `while` loop. You should probably also use a for loop. You may want to next one loop inside the other.
