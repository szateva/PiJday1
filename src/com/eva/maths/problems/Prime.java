package com.eva.maths.problems;

import java.util.Scanner;

/*
This code checks if a user input is a prime number or not.
 */

public class Prime {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = userInput.nextInt();

        int step = 2;
        int div = 0;
        while (step <= num && div <= 1) {
            if (num % step == 0) {
                div++;// break;
            }
            step++;
        }

        if (div > 1) {
            System.out.println("The number " + num + " is not a prime number");
        } else {
            System.out.println("The number " + num + " is a prime number");
        }
    }
}
