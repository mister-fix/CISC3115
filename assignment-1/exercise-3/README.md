# Instructions

Write a program that prompts the user (at the keyboard) for a value and searches the file `numbers.text` for that value, printing out the **last** position where the number appears in the file (the first number in the file is at position 1). If the number does not appear in the file, print out an appropriate message. Continue asking the user for values until they signal end-of-file (in Windows one enters end-of-file at the keyboard by entering Ctl + Z, in UNix end-of-file is indicated by entering Ctl - D). The logic is the same as end-of-file on a disk file -- i.e., if your Scanner variable is named 'keyboard', you would have the loop condition `while (keyboard.hasNextInt())`.

**The name of you rclass should be `FindLast`.**

For example, if the file `numbers.text` contains:

```plaintext
10
23
43
5
12
23
9
8
10
1
16
9
```

Here is a sample execution of the program.

**User input is in bold.** Your program should replicate the prompts and output.

<pre><code>
Enter a number: <b>10</b>
10 kast appears in the file at position 9
Enter a number: <b>29</b>
29 does not appear in the file
Enter a number: <b>9</b>
9 last appears in the file at position 12
Enter a number:
</code></pre>

*Additional Notes:*
*numbers.text should not be modified.*
*Regarding your code's standard output, CodeLab will check for case errors and will check whitespace (tabs, spaces, newlines) exactly except that it will ignore all trailing whitespace.*

**Instructors Notes:**

Hints:

1. You should have two Scanners: one to get th einput that the user tpes at the keyboard, and the other to read the file called numbers.text.
2. Don't wory about end-of-file, Control-Z, and Control-D. The important point is that you should have a while loop like this (assuming that `keyboard` is the Scanner that gets input from the user): <pre><code>while (heyboard.hasNextInt()) { 
        // body loop
    }</code></pre> It's okay if you use `hasNext()` instead of `hasNextInt()`.
3. Suppose you've created a Scanner called `inputFile` to read from the numbers.text file and laready used inputFile`to read the entire file. Let's say you'd now like to start reading from the beginning of the file again. Here's how to do that: <pre><code>input.close()
inputFile = new Scanner(new File("numbers.text"));</code></pre> Now you've effectively "reset" the Scanner to read from the beginning of the file.
4. You do not have to use any arrays in this program.

Big hint: It might be helpful to write a method that follows the following pseudocode, and call this method as needed in main. (However, there are other valid ways to solve this).

```plaintext
method findLastPositon
// input: number, what the user wants to search for
// output: the index of the last occurrence of number in the file, or -1 if the number isn't in the file
    position = -1
    currPositon = 1
    open the file using SCanner
    while we haven't yet reached the end of the file
        read in currNumber from file
        if currNumber == number
            position = currPosition
        position++
    close file // not totally necessary
    return position
```
