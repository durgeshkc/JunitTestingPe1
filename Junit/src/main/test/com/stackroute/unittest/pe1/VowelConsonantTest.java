package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {

    VowelConsonant obj;
    @Before
    public void setUp() throws Exception {
        VowelConsonant obj = new VowelConsonant();
    }

    @After
    public void tearDown() throws Exception {
        VowelConsonant obj = null;
    }

    @Test
    public void isProperString() {
        assertEquals(true,obj.isProperString("wwdddd"));
    }

    @Test
    public void checkForVowel() {
        assertEquals(true,obj.checkForVowel('a'));
    }
}