package edu.lernia.labb5;

public class Dice extends BoardGameMaterial {
    public int value = 0;

    public Dice() {
        value = (int) Math.random();
    }

    public int DiceRoll() {
        value = (int)(Math.random()*6+1);
        return value;
    }

    public int DiceReroll() {
        return DiceRoll();
    }

    public String getString() {
        return "Dice shows " + value;
    }
}
