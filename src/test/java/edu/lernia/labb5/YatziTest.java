package edu.lernia.labb5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    @Test
    void isYatziWhenAllDiceMatches() {
        Dice[] dice = new Dice[5];
        for (int i = 0; i < 5; i++) {
            dice[i] = new Dice();
        }
        BoardGameMaterial check = new BoardGameMaterial();
        assertEquals(true, check.CheckYatzi(dice));
        
    }


    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Dice[] dice = new Dice[5];
        for(int i = 0; i < 5; i++) {
            dice[i] = new Dice();
        }
        BoardGameMaterial check = new BoardGameMaterial();
        assertEquals(false, check.CheckYatzi(dice));
        
    }
}
