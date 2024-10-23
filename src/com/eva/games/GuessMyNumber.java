package com.eva.games;

/*
Write a program that thinks of a random number between 0 and 1000, and then lets the user try to
guess it. For every guess, the computer says whether the guess is correct, or too low, or too high.
When the user finds the number, the computer will tell how many guesses were needed. The output
could be similar to the following example:
Try to guess my number!
Tell me a number: 2
No! My number is higher.
Tell me a number: 800
No! My number is lower.
Tell me a number: 500
No! My number is lower.
Tell me a number: 350
No! My number is higher.
Tell me a number: 376
CORRECT!
You needed 5 guesses.
Hint: to get a random number between 0 and 1000, use the following line:
int numberToGuess = (int) Math.round(1000 * Math.random());
 */

import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberToGuess = (int) Math.round(1000 * Math.random());

        System.out.println("Try to guess my number!");
        System.out.print("Tell me a number: ");
        int guess = scanner.nextInt();
        int noOfGuesses = 1;

        while (guess != numberToGuess) {
            if (guess < numberToGuess) {
                System.out.println("No, my number is higher!");
                noOfGuesses++;
                System.out.print("Tell me a number: ");
                guess = scanner.nextInt();
            } else {
                System.out.println("No, my number is lower!");
                noOfGuesses++;
                System.out.print("Tell me a number: ");
                guess = scanner.nextInt();
            }
        }
        System.out.println("Correct");
        System.out.println("You needed " + noOfGuesses + " guesses!");
    }
}

