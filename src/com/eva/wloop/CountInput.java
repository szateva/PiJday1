package com.eva.wloop;/*
Write a program that reads a series of numbers, ending with 0, and then tells you how many numbers
you have keyed in (other than the last 0). For example, if you keyed in the numbers 5, -10, 50, 22,
-945, 12, 0 it would output \You have entered 6 numbers.".
 */

public class CountInput {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int totalNumbers = 0;
        boolean finished = false;
        while (!finished) {
            System.out.println("Enter a number (enter -1 to stop): ");
            int num = scan.nextInt();
            if (num != -1){
                totalNumbers++;
            }else {
                finished = true;
            }
        }System.out.println("You have entered " + totalNumbers + " numbers");
    }
}
