# Instructions

A 2-dimensional 3x3 array of ints, has been declared and assigned to **tictactoe**. Write an expression whose value is true if the elements of the diagonal that includes the first element of the first row are all equal.  
*Additional Notes: tictactoe should not be modified*

**Solution**

```java
tictactoe[0][0] == tictactoe[1][1] && tictactoe[0][0] == tictactoe[2][2];
```
