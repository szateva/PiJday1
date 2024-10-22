package com.eva.maths.problems;

import java.util.Scanner;

public class Prime2 {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        int step = 2;
        int div = 0;
        while (step <= num && div <= 1) {
            if (num % step == 0) {
                div++;
            }
            step++;
        }
        return div <= 1;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = userInput.nextInt();

        if (isPrime(num)) {
            System.out.println("The number " + num + " is a prime number");
        } else {
            System.out.println("The number " + num + " is not a prime number");
        }
    }
}
