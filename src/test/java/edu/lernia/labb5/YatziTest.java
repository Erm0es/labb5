package edu.lernia.labb5;

import org.junit.jupiter.api.Test;

import edu.lernia.labb5.Dice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    @Test
    void isYatziWhenAllDiceMatches() {
        Dice[] dice = new Dice[5];
        for(Dice die: dice) {
            die.value = 6;
        }
        //Assert something?
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Dice[] dice = new Dice[5];
        for(Dice d: dice) {
            d.value = 6;
        }
        dice[5].value = 1;
        //Assert something?
    }
}
