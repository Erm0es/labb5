package edu.lernia.labb5;

import java.util.Scanner;

public class YatziMain {
    public static Dice[] dice;
    public static boolean bGameIsOn = true;

    public static void main(String[] args) {
        int turn = 0;
        dice = new Dice[5];
        for(int i=0 ; i <5; i++) {
            dice[i] = new Dice();
        }
        //We will continue until the game is over
        while(bGameIsOn == true) {
            turn = 0;
            System.out.println("Welcome to Yatzi!");
            while(turn < 3) {
                System.out.println("Starting turn " + (turn+1) + " of 3, rolling dice.");
                for(int roll=0; roll<dice.length; roll++) {
                    dice[roll].DiceRoll();
                    //dice[i].value = 5; //Test if yatzi work
                    System.out.println(roll + ": " + dice[roll].getString());
                }
                //YATZI
                boolean yatzi = true;
                for(int sameNumber=1; sameNumber<5; sameNumber++) {
                    if(dice[sameNumber].value!=dice[sameNumber-1].value) {
                        //Set yatzi to false
                        yatzi = false;
                    }
                }
                if(yatzi == true) {
                    System.out.println("You got YATZI! in " + dice[0].value + "'s");
                    return;
                } else {
                    //Here we check if there is no Yatzy: then we check what turn we are on and asks the player if we want to continue or not
                    if(turn != 2) {
                        System.out.println("Want to throw again? (y for yes, anything else for no)");
                        Scanner sc = new Scanner(System.in);
                            if(sc.next().equals("y")) {
                                ++turn;
                            } else {
                                bGameIsOn = !bGameIsOn;
                                break;
                            }
                    } else {
                        System.out.println("Game over! Want to play again?");
                        Scanner sc = new Scanner(System.in);
                        if(sc.next().equals("y")) {
                            turn = 0;
                        } else {
                            bGameIsOn = !bGameIsOn;
                            break;
                        }
                        sc.close();
                    }
                }
            }
        }
    }
}