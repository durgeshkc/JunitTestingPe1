package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LastNCharactersRepeatingTest {

    LastNCharactersRepeating obj;
    @Before
    public void setUp() throws Exception {
        LastNCharactersRepeating obj = new LastNCharactersRepeating();
    }

    @After
    public void tearDown() throws Exception {
        LastNCharactersRepeating obj = null;
    }

    @Test
    public void lastNCharac() {
        assertEquals("route",obj.lastNCharac("Stackroute",5));
    }

    @Test
    public void lastNCharac2() {
        assertEquals("rout",obj.lastNCharac("Stackroute",5));
    }

    @Test
    public void getResult() {
        assertEquals("Stackroute",obj.getResult("Stackroute",5,"route"));
    }
    @Test
    public void getResult2() {
        assertEquals("Stackrouterouterouterouterouteroute",obj.getResult("Stackroute",5,"route"));
    }
}