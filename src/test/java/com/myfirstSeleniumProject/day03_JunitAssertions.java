package com.myfirstSeleniumProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class day03_JunitAssertions {



    @Test
    public void assertions(){
        Assertions.assertEquals(5,5);
    }



    @Test
    public  void assertEquals(){
        Assertions.assertEquals("apple","APPLE".toLowerCase());
    }



    @Test
    public void assertEquals02(){
        Assertions.assertEquals(5.12,5.12);
    }



    @Test
    public void  assertEquals03(){
        Assertions.assertTrue(10>8);
    }


    @Test
    public  void  assertEquals04(){

        Assertions.assertTrue(7>6);
        Assertions.assertTrue(5==5);

        Assertions.assertFalse(6>5);


    }

    @Test
    public void assertNull(){

        String str= null;

        Assertions.assertNull(str);
        Assertions.assertFalse("Java".contains("Techpro"));

    }
}

