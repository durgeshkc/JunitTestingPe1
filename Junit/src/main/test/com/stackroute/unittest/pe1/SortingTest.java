package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortingTest {

    Sorting obj;
    @Before
    public void setUp() throws Exception {
        Sorting obj = new Sorting();
    }

    @After
    public void tearDown() throws Exception {
        Sorting obj = null;
    }

    @Test
    public void checkForRange() {
        assertTrue(obj.checkForRange(55));
//        assertTrue("khgcgj",false);
    }
    @Test
    public void checkRange() {
        assertTrue("your range is False",obj.checkForRange(5));
    }

    @Test
    public void getTotal() {
        ArrayList<Integer> a = new ArrayList(Arrays.asList(2,3,4,5,3,4));
        assertEquals(10,obj.getTotal(a));
    }

    @Test
    public void gettingTotal() {
        ArrayList<Integer> a = new ArrayList(Arrays.asList(1,3,4,5,3,4));
        assertEquals(10,obj.getTotal(a));
    }
}