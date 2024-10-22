package com.eva.tests;

import com.eva.max.problems.MaxOfFive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMaxOfFive {

    @Test
    public void testMaxOfFive() {

        // GIVEN
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // WHEN
        Integer max = MaxOfFive.maxOfFive(numbers);

        // THEN
        Assertions.assertEquals(5, max);

    }

}
