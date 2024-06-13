package LLDTicTacToe;

import java.util.Deque;
import java.util.Scanner;

public class TicTacToeGame {

    private Board board;
    private Deque<Player> players;
    public TicTacToeGame(){
        init();
    }

    private void init() {
        players = new java.util.LinkedList<>();
        PlayingPieceO oPiece = new PlayingPieceO();
        Player player1 = new Player("Player 1", oPiece);
        PlayingPieceX xPiece = new PlayingPieceX();
        Player player2 = new Player("Player 2", xPiece);
        players.add(player1);
        players.add(player2);
        board = new Board(3);
    }
    private void start() {
        boolean noWinner = Boolean.TRUE;
        board.printBoard();
       while (noWinner) {
            Player currentPlayer = players.poll();
            System.out.println("Player " + currentPlayer.getName() + " turn");
            int row = 0;
            int col = 0;
           System.out.println("Enter row and column");
           Scanner scanner = new Scanner(System.in);
           row = scanner.nextInt();
           col = scanner.nextInt();
            boolean validInput = Boolean.FALSE;
            while (!validInput) {
                if (board.addPeice(row, col, currentPlayer.getPlayingPiece())) {
                    validInput = Boolean.TRUE;
                } else {
                    System.out.println("Invalid input, try again");
                }
            }
            board.printBoard();
            noWinner = checkWinner();
            players.add(currentPlayer);
        }
    }

    public boolean checkWinner() {
        return false;
    }

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.init();
        game.start();
    }
}
