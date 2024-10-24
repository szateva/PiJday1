package com.eva.wloop;

/*
Modify your program from the previous exercise so that it outputs \Yes" when the numbers are consecutive,
regardless of whether they go up or down. For example, both \2,3,4,5,6,-1" and \10,9,8,7,-
1" should now result in \Yes".
 */

/* TODO
- consecutive = "No"
if for loop all Yes or all No consecutive = "Yes"
return consecutive
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        List<Integer> inputs = getInputNumbers();
        if(isAscending(inputs) || isDescending(inputs)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

    private static List<Integer> getInputNumbers() {
        // doesn't have a parameter, because it doesn't need anything from the outside
        // everything the method needs is 'created' within

        List<Integer> numbers = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);

        boolean finished = false;
        while(!finished){
            System.out.println("Please enter a number (to stop tyep -1): ");
            Integer number = in.nextInt();
            if(number != -1){
                numbers.add(number);
            }else {
                finished = true;
            }
        }
        return numbers;
    }
    private static boolean isAscending(List<Integer> numbers) {
        boolean ascending = true;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if(numbers.get(i) > numbers.get(i+1)) {
                ascending = false;
            }
        }
        return ascending;
    }
    private static boolean isDescending(List<Integer> numbers) {
        boolean descending = true;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if(numbers.get(i) < numbers.get(i+1)) {
                descending = false;
            }
        }
        return descending;
    }
}
