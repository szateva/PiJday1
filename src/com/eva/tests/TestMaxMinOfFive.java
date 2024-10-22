package com.eva.tests;

import com.eva.max.problems.MaxMinOfFive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMaxMinOfFive {

    @Test
    public void testMaxMinOfFive() {

        // GIVEN
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // WHEN
        Integer max = MaxMinOfFive.maxOfFive(numbers);
        Integer min = MaxMinOfFive.minOfFive(numbers);

        // THEN
        Assertions.assertEquals(5, max);
        Assertions.assertEquals(1, min);

    }

}
