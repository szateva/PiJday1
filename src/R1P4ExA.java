/*
Write a program that outputs the squares of all the numbers from 1 to 10, i.e., the output will be the
numbers 1, 4, 9, 16 and so on up to 100.
 */

public class R1P4ExA {
    public static void main(String[] args) {
        int num = 0;
        int square = 0;
        while (square < 100) {
            num++;
            square = num * num;
            System.out.print(square + ", ");
        }
    }
}
