package com.eva.tests;

import com.eva.max.problems.MaxMinOf5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaxMinOf5 {

    private MaxMinOf5 maxMinOf5;

    @Test
    public void testMaxOfFive() {
        MaxMinOf5 maxMinOf5 = new MaxMinOf5();

        Assertions.assertEquals(5, maxMinOf5.maxOfFive(1, 2, 3, 4, 5), "The maximum should be 5");
        Assertions.assertEquals(10, maxMinOf5.maxOfFive(10, 2, 3, 4, 5), "The maximum should be 10");
        Assertions.assertEquals(20, maxMinOf5.maxOfFive(10, 20, 3, 4, 5), "The maximum should be 20");
        Assertions.assertEquals(30, maxMinOf5.maxOfFive(10, 20, 30, 4, 5), "The maximum should be 30");
        Assertions.assertEquals(40, maxMinOf5.maxOfFive(10, 20, 30, 40, 5), "The maximum should be 40");
        Assertions.assertEquals(50, maxMinOf5.maxOfFive(10, 20, 30, 40, 50), "The maximum should be 50");

    }
}
