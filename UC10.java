public class UC10 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        System.out.println(isDraw());
    }

    static boolean isDraw() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // If any cell is empty, it's not a draw
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        // No empty cells → draw
        return true;
    }
}