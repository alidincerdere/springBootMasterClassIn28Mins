package com.adere.junit;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by adere on 1.11.2018.
 */
public class MyMathTest {

    @BeforeEach
    public void before() {
        System.out.println("before");
    }


    @Test
    public void sum_with3numbers() {

        System.out.println("test 1");
        int[] numbers = {1, 2, 3};

        MyMath myMath = new MyMath();

        assertEquals(6, myMath.sum(numbers));

    }

    @Test
    public void sum_with1number() {

        System.out.println("test 2");
        int[] numbers = {3};

        MyMath myMath = new MyMath();

        assertEquals(3, myMath.sum(numbers));

        assertTrue(true);

    }

    @AfterEach
    public void after() {
        System.out.println("after");
    }
}
