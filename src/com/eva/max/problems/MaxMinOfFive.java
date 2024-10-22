package com.eva.max.problems;

/*
Write a program that asks the user to type in 5 numbers, and that outputs the largest of these numbers and the smallest
of these numbers. So, for example, if the user types in the numbers 2456 457 13 999 35, the output will be as follows:
The largest number is 2456
The smallest number is 13
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxMinOfFive {

    public static int maxOfFive(List<Integer> numbers) {
        int max = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }

        }
        return max;
    }
    public static int minOfFive(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 numbers: ");
        String input = scanner.nextLine();
        String[] pieces = input.split(" ");

        for (String piece : pieces) {
            numbers.add(Integer.parseInt(piece));
        }

        System.out.println("The largest in the list is: " + maxOfFive(numbers));
        System.out.println("The smallest in the list is: " + minOfFive(numbers));
    }
}

