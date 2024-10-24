package com.eva.wloop;

/*
Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. At that point,
print \Yes" if the numbers were consecutive and increasing and \No" otherwise. For example, the
sequences \1,2,3,4,-1" and \5,6,7,8,9,10,11,-1" should lead to the output \Yes", but \2,3,5,6,7,-1",
\10,9,8,7,-1", and \1,1,2,3,4,5,-1" should lead to the output "No".
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoingUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean finished = false;

        List<String> order = new ArrayList<String>();

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        while (!finished) {
            System.out.println("Enter a number (type -1 to stop): ");
            int nextNum = scanner.nextInt();
            if (nextNum != -1) {
                if (num < nextNum) {
                    order.add("Yes");
                } else {
                    order.add("No");
                }
            } else {
                finished = true;
            }
            num = nextNum;

        }
        boolean goingUp = true;
        for (String s : order) {
            if (s.equals("No")) {
                goingUp = false;
            }
        }
        if (goingUp) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
