package com.kinbiko.java.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kinbiko.java.kata.solutions.*;

public class Kata3Test{
    InvocationCounter target = new Kata3();
    		//new Kata3Solution();

    @Test
    public void testGetMyProperty(){
    	for (int i=1; i<134; i++){
    		assertEquals(target.getTwiceTimesInvoked(), 2*i);    		
    	}
    }
}
