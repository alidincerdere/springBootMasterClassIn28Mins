package com.adere.junit;

/**
 * Created by adere on 31.10.2018.
 */
public class MyMath {

    int sum (int[] numbers) {

        int sum = 0;

        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
