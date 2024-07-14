class Tictactoe {
    public static void main(String[] args) {
        int[][] tictactoe = new int[3][3];
        boolean elementsOfFirstColumnAreEqual = (tictactoe[0][0] == tictactoe[1][0])
                && (tictactoe[1][0] == tictactoe[2][0]);
    }
}
