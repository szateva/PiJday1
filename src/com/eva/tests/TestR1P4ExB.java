package com.eva.tests;

import com.eva.max.problems.R1P4ExB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestR1P4ExB {

    private R1P4ExB r1P4ExB;

    @Test
    public void testMaxOfFive() {
        R1P4ExB r1P4ExB = new R1P4ExB();

        Assertions.assertEquals(5, r1P4ExB.maxOfFive(1, 2, 3, 4, 5), "The maximum should be 5");
        Assertions.assertEquals(10, r1P4ExB.maxOfFive(10, 2, 3, 4, 5), "The maximum should be 10");
        Assertions.assertEquals(20, r1P4ExB.maxOfFive(10, 20, 3, 4, 5), "The maximum should be 20");
        Assertions.assertEquals(30, r1P4ExB.maxOfFive(10, 20, 30, 4, 5), "The maximum should be 30");
        Assertions.assertEquals(40, r1P4ExB.maxOfFive(10, 20, 30, 40, 5), "The maximum should be 40");
        Assertions.assertEquals(50, r1P4ExB.maxOfFive(10, 20, 30, 40, 50), "The maximum should be 50");

    }
}
