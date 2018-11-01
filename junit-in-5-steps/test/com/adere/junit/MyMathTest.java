package com.adere.junit;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by adere on 1.11.2018.
 */
public class MyMathTest {

    @Test
    public void sum_with3numbers() {

        int[] numbers = {1, 2, 3};

        MyMath myMath = new MyMath();

        assertEquals(6, myMath.sum(numbers));

    }

    @Test
    public void sum_with1number() {

        int[] numbers = {3};

        MyMath myMath = new MyMath();

        assertEquals(3, myMath.sum(numbers));

    }
}
