package com.eva.tests;

import com.eva.maths.problems.Division;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDivision {

    @Test
    public void testDivision1() {
        Assertions.assertEquals(1, Division.quotientDiv(5,3));
        Assertions.assertEquals(2, Division.remainderDiv(5,3));
    }

    @Test
    public void testDivision2() {
        Assertions.assertEquals(3, Division.quotientDiv(12,4));
        Assertions.assertEquals(0, Division.remainderDiv(12,4));
    }

    @Test
    public void testDivision3() {
        Assertions.assertEquals(0, Division.quotientDiv(2,4));
        Assertions.assertEquals(2, Division.remainderDiv(2,4));
    }

    @Test
    public void testDivision4() {
        Assertions.assertEquals(3, Division.quotientDiv(20,6));
        Assertions.assertEquals(2, Division.remainderDiv(20,6));
    }

    @Test
    public void testDivision5() {
        Assertions.assertEquals(3, Division.quotientDiv(15,5));
        Assertions.assertEquals(0, Division.remainderDiv(15,5));
    }
}
