package com.adere.mockito.mockitodemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by adere on 2.11.2018.
 */
public class SomeBusinessStubTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());

        int result = someBusiness.findTheGreatestFromAllData();

        assertEquals(24, result);
    }

}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{24, 6, 15};
    }
}