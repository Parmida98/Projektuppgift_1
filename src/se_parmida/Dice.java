package se_parmida;

import java.util.Random;

public class Dice {
    private Random random;
    private int result;


    public Dice() {
        this.random = new Random();
        this.result = 0;

    }


    public int rollDice() {
        this.result = this.random.nextInt(6) + 1;
        return this.result;

    }
}

