public class UC8 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human Turn");
                // call humanMove();
            } else {
                System.out.println("Computer Turn");
                // call computerMove();
            }

            // After move, check game status
            gameOver = checkWin() || checkDraw();

            // Switch turn
            isHumanTurn = !isHumanTurn;
        }

        System.out.println("Game Over!");
    }

    // Dummy methods (replace with actual logic)
    static boolean checkWin() {
        return false;
    }

    static boolean checkDraw() {
        return false;
    }
}