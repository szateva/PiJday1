/*
Write a program that requests two numbers from the user and then outputs their product. You cannot use the "*" operator.
Can you make your program work correctly with one or both numbers being negative?
 */

import java.util.Scanner;

public class Multiplication {
    public static int multiply(int num1, int num2) {
        int result = 0;
        int num1Abs = Math.abs(num1);
        int num2Abs = Math.abs(num2);
        for (int i = 0; i < num1Abs; i++) {
            result += num2Abs;
        }
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            result = - result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = userInput.nextInt();

        System.out.print("Enter another number: ");
        int num2 = userInput.nextInt();

        Multiplication multiplication = new Multiplication();
        int multiply = multiplication.multiply(num1, num2);

        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + multiply);
    }
}
