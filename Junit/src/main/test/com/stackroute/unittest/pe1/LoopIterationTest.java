package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopIterationTest {

    LoopIteration obj;
    @Before
    public void setUp() throws Exception {
        LoopIteration obj = new LoopIteration();
    }

    @After
    public void tearDown() throws Exception {
        LoopIteration obj = null;
    }

    @Test
    public void getSequence() {
//        assertEquals(12345,obj.getSequence(5));

        assertEquals("122333444455555",obj.getSequence(5));
    }
    @Test
    public void Sequence() {
//        assertEquals(12345,obj.getSequence(5));

        assertEquals("1223334444",obj.getSequence(5));
    }

    @Test
    public void Sequence2() {
//        assertEquals(12345,obj.getSequence(5));

        assertEquals("",obj.getSequence(0));
    }

}