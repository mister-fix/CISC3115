class Tictactoe {
    public static void main(String[] args) {
        int[][] tictactoe = new int[3][3];
        boolean diagonalElementsAreEqual = (tictactoe[0][0] == tictactoe[1][1]) && (tictactoe[0][0] == tictactoe[2][2]);
    }
}
