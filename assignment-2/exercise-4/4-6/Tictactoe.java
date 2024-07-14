class Tictactoe {
    public static void main(String[] args) {
        int[][] tictactoe = new int[3][3];
        boolean elementsOfLastRowAreEqual = (tictactoe[2][0] == tictactoe[2][1])
                && (tictactoe[2][1] == tictactoe[2][2]);
    }
}
