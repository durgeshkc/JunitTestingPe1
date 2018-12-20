package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UnspecifiedArgumentsTest {

    UnspecifiedArguments obj;
    @Before
    public void setUp() throws Exception {
        UnspecifiedArguments obj = new UnspecifiedArguments();
    }

    @After
    public void tearDown() throws Exception {
        UnspecifiedArguments obj = null;
    }

    @Test
    public void getTotal() {
//        int a[]={2,3,4,5,3,4} ;
        ArrayList<Integer> a = new ArrayList(Arrays.asList(12,23,2,4));
        assertEquals(41,obj.getTotal(a));
    }

    @Test
    public void gettingTotal() {
//        int a[]={1,3,4,5,3,4} ;
        ArrayList<Integer> a = new ArrayList(Arrays.asList(1,3,4,5,3,4));
        assertEquals("You didnt get the required Sum",10,obj.getTotal(a));
    }
}