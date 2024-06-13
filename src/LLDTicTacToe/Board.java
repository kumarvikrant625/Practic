package LLDTicTacToe;

public class Board {

    private int size;
    private PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }


    public boolean addPeice(int row, int col, PlayingPiece piece){
        if(board[row][col] == null){
            board[row][col] = piece;
            return true;
        }
        return false;
    }

    public void printBoard(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + "  | ");
            }
            System.out.print("\n");
        }
    }
}
