package com.andrew_ya.stats;

import org.junit.Test;


public class StatisticTest {

    @Test
    public void averageTest() {

        int[] input = {1, 2, 3, 4};

        double expected = 2.5;

        assert(expected == Statistic.average(input));

    }

    @Test
    public void averageZeroTest() {

        int[] input = {};

        double expected = 0;

        assert(expected == Statistic.average(input));

    }

}
