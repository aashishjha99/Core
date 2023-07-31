package lld.tictocgame;

import lld.tictocgame.model.TicTac;

public class TicTacGameDriver {

    public static void main(String[] args) {


        TicTac functionality = new TicTac();
        functionality.initialise();
        System.out.println("Winner Of The Game " + functionality.startGame());


    }
}
