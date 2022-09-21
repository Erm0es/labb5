package edu.lernia.labb5;

import java.util.Scanner;

public class YatziMain {
    public static Dice[] dice;
    public static boolean bGameIsOn = true;
    static boolean yatzi = true;

    public static void main(String[] args) {
        StartGame();
        ContinueGame();
    }

    public static void StartGame() {
        dice = new Dice[5];
        for (int i = 0; i < 5; i++) {
            dice[i] = new Dice();
        }
    }

    public static void CheckYatzi(boolean yatzi) {
        for (int i = 1; i < 5; i++) {
            if (dice[i].value != dice[i - 1].value) {
                yatzi = false;
            }
            if (yatzi == true) {
                System.out.println("You got YATZI! in " + dice[0].value + "'s");
                return;
            }
        }
    }

    public static void ContinueGame() {
        while (bGameIsOn == true) {
            int turn = 0;
            System.out.println("Welcome to Yatzi!");
            while (turn < 3) {
                System.out.println("Starting turn " + (turn + 1) + " of 3, rolling dice.");
                for (int roll = 0; roll < dice.length; roll++) {
                    dice[roll].DiceRoll();
                    // dice[roll].value = 5; //Test if yatzi work
                    System.out.println(roll + ": " + dice[roll].getString());
                }

                CheckYatzi(yatzi);

                if (turn != 2) {
                    System.out.println("Want to throw again? (y for yes, anything else for no)");
                    Scanner inputScanner = new Scanner(System.in);
                    if (inputScanner.next().equals("y")) {
                        ++turn;
                    } else {
                        bGameIsOn = !bGameIsOn;
                        break;
                    }

                } else {
                    System.out.println("Game over! Want to play again?");
                    Scanner scannerPlayAgain = new Scanner(System.in);
                    if (scannerPlayAgain.next().equals("y")) {
                        turn = 0;
                    } else {
                        bGameIsOn = !bGameIsOn;
                        break;
                    }

                }
            }

        }

    }
}