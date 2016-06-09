package com.kinbiko.java.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
 * Write a class implementing an interface InvocationCounter, with a method which returns
 * twice the number of times this method has been called.
 */
public class Kata3Test{
    InvocationCounter target = new Kata3();

    @Test
    public void testGetMyProperty(){
    	for (int i=1; i<134; i++){
    		assertEquals(target.getTwiceTimesInvoked(), 2*i);    		
    	}
    }
}
