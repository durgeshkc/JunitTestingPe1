package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionalCheckTest {

    ConditionalCheck obj;
    @Before
    public void setUp() throws Exception {
        ConditionalCheck obj = new ConditionalCheck();
    }

    @After
    public void tearDown() throws Exception {
        ConditionalCheck obj = null;
    }

    @Test
    public void checkEven() {
        assertEquals(true,obj.checkEven(6));
    }

    @Test
    public void checkFalseEven()
    {
        assertEquals(true,obj.checkEven(7));
    }

    @Test
    public void liesInRange()

    {
        assertEquals(false,obj.liesInRange(22));
    }
    @Test
    public void doesnotLieInRange()

    {
        assertEquals("Out of Range",false,obj.liesInRange(56));
    }

    @Test
    public void liesinRange()
    {
        assertEquals(false,obj.liesInRange(32));
    }

}