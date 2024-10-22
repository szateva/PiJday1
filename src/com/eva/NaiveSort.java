package com.eva;
/*
Write a program that reads three numbers and prints them in order, from lowest to highest.
 */

import java.util.Scanner;

public class NaiveSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));
        int middle;

        if(num1 < largest && num1 > smallest){
            middle = num1;
        } else if (num2 < largest && num2> smallest) {
            middle = num2;
        }else {
            middle = num3;
        }
        System.out.println("The numbers: " + num1 + ", " + num2 + ", " + num3 + ", in order are "
                + smallest + ", " + middle + ", " + largest);
    }
}
