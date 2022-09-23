package edu.lernia.labb5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    @Test
    void isYatziWhenAllDiceMatches() {
        Dice[] dice = new Dice[5];
        for (int roll = 0; roll < 5; roll++) {
            dice[roll] = new Dice();
        }
        assertEquals(true, BoardGameMaterial.CheckYatzi(dice));
    }


    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Dice[] dice = new Dice[5];
        for(int roll = 0; roll < 5; roll++) {
            dice[roll] = new Dice();
        }
        dice[4].DiceRoll();
        assertEquals(false, BoardGameMaterial.CheckYatzi(dice));
    }
}
