package com.eva.max.problems;/*
Write a program that asks the user to type in 5 numbers, and that outputs the largest of these numbers and the smallest
of these numbers. So, for example, if the user types in the numbers 2456 457 13 999 35, the output will be as follows:
The largest number is 2456
The smallest number is 13
 */

import java.util.Scanner;

public class MaxMinOf5 {

    public static int maxOfFive(int a, int b, int c, int d, int e) {
        return Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
    }
    public static int minOfFive(int a, int b, int c, int d, int e) {
        return Math.min(a, Math.min(b, Math.max(c, Math.max(d, e))));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();
        System.out.println("Enter the third number");
        int num3 = scan.nextInt();
        System.out.println("Enter the fourth number");
        int num4 = scan.nextInt();
        System.out.println("Enter the fifth number");
        int num5 = scan.nextInt();

        System.out.println("The max of " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + " is " + maxOfFive(num1, num2, num3, num4, num5));
        System.out.printf("The max of %d, %d, %d, %d, %d is %d%n", num1, num2, num3, num4, num5, maxOfFive(num1, num2, num3, num4, num5));
        System.out.println("The min of " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + " is " + minOfFive(num1, num2, num3, num4, num5));
        System.out.printf("The min of %d, %d, %d, %d, %d is %d%n", num1, num2, num3, num4, num5, minOfFive(num1, num2, num3, num4, num5));

    }
}
