package com.adere.mockito.mockitodemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by adere on 2.11.2018.
 */
public class SomeBusinessMockTest {

    @Test
    public void testFindTheGreatestFromAllData() {

        DataService dataServiceMock = mock(DataService.class);

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15,6,24});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);

        int result = someBusiness.findTheGreatestFromAllData();

        assertEquals(24, result);
    }

    @Test
    public void testFindTheGreatestFromAllDataOneValue() {

        DataService dataServiceMock = mock(DataService.class);

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);

        int result = someBusiness.findTheGreatestFromAllData();

        assertEquals(24, result);
    }

}

