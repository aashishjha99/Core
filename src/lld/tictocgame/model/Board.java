package lld.tictocgame.model;

import java.util.ArrayList;
import java.util.List;

import com.sun.tools.javac.util.Pair;


public class Board {

    private Integer size;
    private PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public Integer getSize() {
        return size;
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {

        if (row >= size || col >= size || board[row][col] != null) {
            return false;
        }

        board[row][col] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                if (board[i][j] == null) {
                    Pair<Integer, Integer> rowCol = new Pair<>(i, j);
                    freeCells.add(rowCol);
                }
        }

        return freeCells;
    }

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getPieceType().name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }


}
