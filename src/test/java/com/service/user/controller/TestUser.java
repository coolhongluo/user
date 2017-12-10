package com.service.user.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestUser {

        UserDelegate userDelegate = new UserDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = userDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}