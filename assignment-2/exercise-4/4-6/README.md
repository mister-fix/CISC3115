# Instructions

A 2-dimensional 3x3 array of ints, has been declared and assigned to **tictactoe**. Write an expression whose value is true if the elements of the last row are all equal.  
*Additional Notes: tictactoe should not be modified*

**Solution**

```java
tictactoe[2][0] == tictactoe[2][1] && tictactoe[2][1] == tictactoe[2][2];
```
