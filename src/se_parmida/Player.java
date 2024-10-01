package se_parmida;

public class Player {
    private String name;
    private int score;


    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    public void addScore(int points){
        this.score += points;
    }

    // fick ut "se_parmida.Player@7c3df479"
    public String toString() {
        return name;
    }
}
