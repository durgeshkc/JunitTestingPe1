package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterCategorizationTest {

    LetterCategorization obj;
    @Before
    public void setUp() throws Exception {
        LetterCategorization obj = new LetterCategorization();
    }

    @After
    public void tearDown() throws Exception {
        LetterCategorization obj = null;
    }
//testing for upper case..............................
    @Test
    public void isUpperCase() {
        assertEquals(true,obj.isUpperCase('a'));
    }

    @Test
    public void UpperCase() {
        assertEquals(true,obj.isUpperCase('A'));
    }

    //testing for Lower case..............................
    @Test
    public void isLowerCase() {
        assertEquals(true,obj.isLowerCase('a'));
    }

    @Test
    public void LowerCase() {
        assertEquals(true,obj.isLowerCase('A'));
    }

    //testing for Digits..............................
    @Test
    public void isADigit() {
        assertEquals(true,obj.isADigit('a'));
    }
    @Test
    public void isaDigit() {
        assertEquals(true,obj.isADigit('5'));
    }
}