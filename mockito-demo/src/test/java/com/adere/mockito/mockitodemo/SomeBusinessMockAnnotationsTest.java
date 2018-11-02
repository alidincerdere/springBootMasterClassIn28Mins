package com.adere.mockito.mockitodemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by adere on 2.11.2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {


    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    public void testFindTheGreatestFromAllData() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{15, 6, 24});
        assertEquals(24, someBusiness.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllDataOneValue() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24});
        assertEquals(24, someBusiness.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllDataNoValues() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, someBusiness.findTheGreatestFromAllData());
    }

}

