package com.service.lwhtest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLwhtest {

        LwhtestDelegate lwhtestDelegate = new LwhtestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = lwhtestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}