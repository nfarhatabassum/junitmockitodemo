package com.learning.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilityImplTest {
    public StringUtility stringUtility;

    @BeforeEach
    public void setUp(){
        stringUtility = new StringUtilityImpl();
    }
    @AfterEach
    public void tearDown(){
        stringUtility = null;
    }

    @Test
    public void testGetLengthOfString(){
        int result = stringUtility.getLengthOfString("Smith");
        assertEquals(5,result,"Expected 5 but found "+result);
    }
    @Test
    @Disabled
    public void testConvertToUpperCase(){
        String result = stringUtility.convertToUpperCase("Mithin");
        assertEquals("MITHIN",result,"Expected MITHIN Uppercase, but Found "+result);
    }
    @Test
    public void testStartsWithA(){
        assertTrue(stringUtility.startsWithA("Ashok"),"Expected true but return false");
    }
    @Test
    public void testNullPointerExceptionForStringLength(){
        assertThrows(NullPointerException.class,()->{
            stringUtility.getLengthOfString(null);
        },"Expected NullPointerException");
    }


}
