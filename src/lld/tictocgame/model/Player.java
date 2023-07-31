package lld.tictocgame.model;

public class Player {

    private String name;
    private PlayingPiece piecces;

    public Player(String name, PlayingPiece piecces) {
        this.name = name;
        this.piecces = piecces;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPiece getPiecces() {
        return piecces;
    }

    public void setPiecces(PlayingPiece piecces) {
        this.piecces = piecces;
    }

}
