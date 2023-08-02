package lld.tictocgame.model;

import com.sun.tools.javac.util.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTac {

    Deque<Player> players;
    Board gameBoard;

    public void initialise() {
        players = new LinkedList<>();
        PlayingPiece pieceX = new PlayingPieceX();
        Player player1 = new Player("Player1", pieceX);

        PlayingPiece pieceO = new PlayingPieceO();
        Player player2 = new Player("Player2", pieceO);


        players.add(player1);
        players.add(player2);
        gameBoard = new Board(3);
    }

    /**
     * Starts the game and continues until there is a winner or the game ends in a tie.
     *
     * @return The name of the player who wins, or "TIE" if the game ends in a tie.
     */
    
    public String startGame() {
        boolean noWinner = true;

        // Loop until there is a winner or the game ends in a tie
        while (noWinner) {
            // Get the player whose turn it is
            Player playerTurn = players.removeFirst();

            // Print the current state of the game board
            gameBoard.printBoard();

            // Get the list of available free cells on the game board
            List<Pair<Integer, Integer>> freeCells = gameBoard.getFreeCells();

            // If there are no more free cells, the game ends in a tie
            if (freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }

            // Ask the player to enter their move (row and column)
            System.out.print("Player: " + playerTurn.getName() + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // Attempt to place the player's piece on the game board
            boolean successfulPut = gameBoard.addPiece(inputRow, inputColumn, playerTurn.getPiecces());

            // If the chosen cell is already occupied or out of bounds, let the player try again
            if (!successfulPut) {
                System.out.println("The selected cell is not free.");
                players.addFirst(playerTurn); // Return the turn to the player for another attempt
                continue;
            }

            // If the piece is successfully placed, add the player back to the end of the turn queue
            players.addLast(playerTurn);

            // Check if the player has won after placing the piece
            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.getPiecces().getPieceType());

            // If there is a winner, return the name of the winning player
            if (winner) {
                return playerTurn.getName();
            }
        }

        // If the loop ends without a winner, it means the game ends in a tie
        return "TIE";
    }


    /**
     * Checks if the specified piece type has won the game by having a sequence of pieces in a row, column, diagonal, or anti-diagonal.
     *
     * @param inputRow    The row index of the last placed piece.
     * @param inputColumn The column index of the last placed piece.
     * @param pieceType   The type of the piece to check for (e.g., X or O).
     * @return True if the specified piece type has a winning sequence, false otherwise.
     */

    private boolean isThereWinner(int inputRow, int inputColumn, PieceType pieceType) {

        // Initialize boolean flags for row, column, diagonal, and anti-diagonal matches
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // Check for row match
        for (int row = 0; row < gameBoard.getSize() - 1; row++) {
            if (gameBoard.getBoard()[inputRow][row] == null || gameBoard.getBoard()[inputRow][row].getPieceType() != pieceType) {
                rowMatch = false; // If any piece is not of the specified type, rowMatch is set to false
            }
        }

        // Check for column match
        for (int col = 0; col < gameBoard.getSize() - 1; col++) {
            if (gameBoard.getBoard()[col][inputColumn] == null || gameBoard.getBoard()[col][inputColumn].getPieceType() != pieceType) {
                columnMatch = false; // If any piece is not of the specified type, columnMatch is set to false
            }
        }

        // Check for diagonal match
        for (int row = 0, column = 0; row < gameBoard.getSize(); row++, column++) {
            if (gameBoard.getBoard()[row][column] == null || gameBoard.getBoard()[row][column].getPieceType() != pieceType) {
                diagonalMatch = false; // If any piece is not of the specified type, diagonalMatch is set to false
            }
        }

        // Check for anti-diagonal match
        for (int row = 0, column = gameBoard.getSize() - 1; row < gameBoard.getSize(); row++, column--) {
            if (gameBoard.getBoard()[row][column] == null || gameBoard.getBoard()[row][column].getPieceType() != pieceType) {
                antiDiagonalMatch = false; // If any piece is not of the specified type, antiDiagonalMatch is set to false
            }
        }

        // Return true if any of the row, column, diagonal, or anti-diagonal matches are true, indicating a winning sequence
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }


}



