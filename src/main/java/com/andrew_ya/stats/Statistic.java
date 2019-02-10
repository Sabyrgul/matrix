package com.andrew_ya.stats;

public class Statistic {

    /**
     *
     * @param a array of int
     * @return average value of array
     */

    static double average(int[] a){

        double accumulator = 0.0;

        for (int i = 0; i < a.length; i++) {
            accumulator += a[i];
        }

        return accumulator / a.length;

    }


}
