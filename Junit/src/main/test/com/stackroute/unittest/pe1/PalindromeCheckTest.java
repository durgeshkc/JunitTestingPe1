package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {

    PalindromeCheck obj;
    @Before
    public void setUp() throws Exception {
        PalindromeCheck obj = new PalindromeCheck();
    }

    @After
    public void tearDown() throws Exception {
        PalindromeCheck obj = null;
    }

    @Test
    public void getSum() {
        assertEquals(8,obj.getSum(7899));
    }

    @Test
    public void getReverse() {
        assertEquals(321,obj.getReverse(123));

    }

    @Test
    public void checkPalindrome() {
        assertEquals(true,obj.checkPalindrome(121,121));
    }
}