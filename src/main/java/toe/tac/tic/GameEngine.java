package toe.tac.tic;

public class GameEngine {
    RoundPanel roundPanel1;
    private int wonGameX;
    private int invalid = 1;
    private int wonGameO;

    public int getWonGameX() {
        return wonGameX;
    }

    public void setWonGameX(int wonGameX) {
        this.wonGameX = wonGameX;
    }

    public int getInvalid() {
        return invalid;
    }

    public void setInvalid(int invalid) {
        this.invalid = invalid;
    }

    public int getWonGameO() {
        return wonGameO;
    }

    public void setWonGameO(int wonGameO) {
        this.wonGameO = wonGameO;
    }

    public RoundPanel getRoundPanel1() {
        return roundPanel1;
    }

    public void setRoundPanel1(RoundPanel roundPanel1) {
        this.roundPanel1 = roundPanel1;
    }
}
