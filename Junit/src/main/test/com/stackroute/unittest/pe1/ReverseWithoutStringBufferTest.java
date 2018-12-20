package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWithoutStringBufferTest {

    ReverseWithoutStringBuffer obj;
    @Before
    public void setUp() throws Exception {
        ReverseWithoutStringBuffer obj= new ReverseWithoutStringBuffer();
    }

    @After
    public void tearDown() throws Exception {
        ReverseWithoutStringBuffer obj = null;
    }

    @Test
    public void getReverse() {
        assertEquals("dcba",obj.getReverse("abcd"));
    }

    @Test
    public void findReverse() {
        assertEquals("abcd",obj.getReverse("abcd"));
    }

    @Test
    public void modifiedReverse() {
        assertEquals("a4321",obj.getReverse("1234a"));
    }

    @Test
    public void nullReverse() {
        assertEquals("",obj.getReverse(""));
    }

    @Test
    public void numericReverse() {
        assertEquals("4321",obj.getReverse("1234"));
    }


}