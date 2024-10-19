/*
Write a program that requests two positive numbers from the user and then outputs the quotient and
the remainder, e.g., if the user enters 7 and 3, your program should output something like \7 divided
by 3 is 2, remainder 1". You cannot use the \/" or \%" operators.
 */

/* TODO
division is repeated subtraction
create tests
quotient and remainder
separate implementation and user interaction
 */

import java.util.Scanner;

public class Division {
    public static int quotientDiv(int num1, int num2) {
        int quotient = 0;
        int remainder = num1;
        while (num2 != 0 && remainder > num2) {
            remainder = remainder - num2;
            System.out.println("remainder = " + remainder);
            quotient++;
            System.out.println("quotient = " + quotient);
        }
        return quotient;
    }

    public static int remainderDiv(int num1, int num2) {
        int quotient = 0;
        int remainder = num1;
        while (num2 != 0 && remainder > num2) {
            remainder =- num2;
            System.out.println("remainder = " + remainder);
            quotient++;
            System.out.println("quotient = " + quotient);
        }
        return remainder;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        int quotient = quotientDiv(num1, num2);
        int remainder = remainderDiv(num1, num2);
        System.out.println("When dividing " + num1 + " with " + num2 + " we get " + quotient + " and remainder " + remainder);
    }
}
