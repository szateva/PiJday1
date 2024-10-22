package com.eva.tests;

import com.eva.maths.problems.Multiplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMultiplication {
    @Test
    public void testMultiplication1(){
        Assertions.assertEquals(Multiplication.multiply(5, 3), 15 );
    }

    @Test
    // first negative
    public void testMultiplication2(){
        Assertions.assertEquals(Multiplication.multiply(-5, 3), -15 );
    }

    @Test
    // second negative
    public void testMultiplication3(){
        Assertions.assertEquals(Multiplication.multiply(5, -3), -15 );
    }

    @Test
    // both negative
    public void testMultiplication4(){
        Assertions.assertEquals(Multiplication.multiply(-5, -3), 15 );
    }

}
