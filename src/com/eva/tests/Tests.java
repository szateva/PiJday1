package com.eva.tests;

import com.eva.maths.problems.Prime2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void testPrime() {
        Assertions.assertTrue(Prime2.isPrime(7), "7 should be a prime number");
    }

    @Test
    public void testNotPrime() {
        Assertions.assertFalse(Prime2.isPrime(8), "8 should not be a prime number");
    }

    @Test
    public void testOne() {
        Assertions.assertFalse(Prime2.isPrime(1), "1 should not be a prime number");
    }

    @Test
    public void testNegativeNumber() {
        Assertions.assertFalse(Prime2.isPrime(-5), "-5 should not be a prime number");
    }
}
