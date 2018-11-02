package com.adere.mockito.mockitodemo;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by adere on 2.11.2018.
 */
public class ListTest {

    @Test
    public void test() {
        List listMock = mock(List.class);

        when(listMock.size()).thenReturn(10);
        assertEquals(10,listMock.size());

    }


    @Test
    public void testGet() {
        List listMock = mock(List.class);

        when(listMock.get(0)).thenReturn("Some String");
        assertEquals("Some String",listMock.get(0));
        assertEquals(null, listMock.get(1));

    }

    @Test
    public void testGet_GenericParameters() {
        List listMock = mock(List.class);

        when(listMock.get(Mockito.anyInt())).thenReturn("Some String");
        assertEquals("Some String",listMock.get(0));
        assertEquals("Some String", listMock.get(1));

    }
}
