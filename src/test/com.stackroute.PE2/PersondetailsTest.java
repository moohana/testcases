package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersondetailsTest {
    Persondetails pd;

    @Before
    public void setUp() throws Exception {
        pd=new Persondetails();
    }

    @After
    public void tearDown() throws Exception {
        pd=null;
    }

    @Test
    public void check() {
        String expectedValue= "Member Name:Harry pattor\n" + "Member age:30\n" + "Member salary:2500.5\n";
        String actual=pd.check("Harry pattor",30,2500.5);
        assertEquals(expectedValue,actual);
    }

}