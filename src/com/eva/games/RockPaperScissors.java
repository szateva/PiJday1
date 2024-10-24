package com.eva.games;

/*
Write a program that reads 2 characters from the keyboard. The characters are either PP, PR, PS,
RP, RR, RS, SP, SR, or SS. They correspond to the selections made by 2 players playing the game of
rock-paper-scissors. Recall that rock beats scissors, paper beats rock, scissors beats paper.
Make the program accept inputs until one player's score is more than 3 points ahead of the other.
Hint: remember that you can use .substring() to get the elements of a String.
 */

/*
- end the game if |player1Score - player2Score| > 3
- player 1 wins when PR, RS, SP
- player 2 wins when RP, SR, PS
- keep player scores
 */

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int player1Score = 0, player2Score = 0;
        
        while (Math.abs(player1Score - player2Score) <= 3) {
            System.out.println("Enter the outcome of Rock, Paper, Scissors: ");
            String outcome = scanner.nextLine();
            if (outcome.equals("PR") || outcome.equals("RS") || outcome.equals("SP")) {
                player1Score++;
            } else if (outcome.equals("RP") || outcome.equals("SR")|| outcome.equals("PS")) {
                player2Score++;
            }
        }
        System.out.println("Player 1: " + player1Score);
        System.out.println("Player 2: " + player2Score);
    }
    
}
