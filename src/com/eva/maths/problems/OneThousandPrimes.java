package com.eva.maths.problems;

/*
Writes on screen the first 1,000 primes.
 */

public class OneThousandPrimes {
    public static void main(String[] args) {
        int countPrimes = 0;
        int num = 0;
        while (countPrimes < 1000) {
            num++;
            if (Prime2.isPrime(num)){
                System.out.println(num + ", ");
                countPrimes++;
            }
        }
    }
}
