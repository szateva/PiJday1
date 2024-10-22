package com.eva.max.problems;/*
Write a program that reads a (arbitrarily long) sequence of positive numbers. The sequence is ended
when the user enters \-1". At that point, the program must output the highest number in the sequence.
 */

import java.util.Scanner;

public class Maximising {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean finished = false;
        int biggest = 0;
        while (!finished) {
            System.out.print("Enter a number (enter -1 to stop): ");
            int number = scanner.nextInt();
            if (number != -1){
                if (number > biggest) {
                    biggest = number;
                }
            }
        }
    }
}
