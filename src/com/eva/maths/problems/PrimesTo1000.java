package com.eva.maths.problems;

/*
Write a program that prints on screen all prime numbers up to 1,000.
 */

public class PrimesTo1000 {

    public static void main(String[] args) {
        for(int i=2;i<=1000;i++){
            if(Prime2.isPrime(i)){
                System.out.print(i + ", ");
            }
        }
    }
}
