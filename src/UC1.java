public class UC1{
    static char[][] board = new char[3][3];

    public static void main(String[] args){
        initializeBoard();
        printBoard();
    }
    
    static void initializeBoard(){
        for(int row = 0; row < 3; row++){
            for(int column = 0;column < 3;column++){
                board[row][column] = '-';
            }
        }
    }

    static void printBoard(){
        System.out.println("------------");
        for(int row = 0; row < 3; row++){
            System.out.print("| ");
            for(int column = 0; column < 3; column++){
                System.out.print(board[row][column] + " | ");
            }
            System.out.println();
            System.out.println("------------");
        }
    }
}