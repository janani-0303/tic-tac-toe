public class UC5{
    static char[][] board = {
        {'-','-','-'},
        {'-','-','-'},
        {'-','-','-'}
    };

    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1));
    }

    static boolean isValidMove(int row, int column){
        if(row < 0 || row > 2 || column < 0 || column > 2){
            return false;
        }

        if(board[row][column] != '-'){
            return false;
        }
        return true;
    }

}