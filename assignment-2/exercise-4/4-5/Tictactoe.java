class Tictactoe {
    public static void main(String[] args) {
        int[][] tictactoe = new int[3][3];
        boolean elementsOfFirstRowAreEqual = (tictactoe[0][0] == tictactoe[0][1])
                && (tictactoe[0][1] == tictactoe[0][2]);
    }
}
