package com.kinbiko.java.kata;

import static org.junit.Assert.fail;

import org.junit.Test;

public class Kata1MakeNewClassTest {
	
	Kata1MakeNewClass target = new Kata1MakeNewClass();
	
	@Test
	public void testKata(){
		Object returned = target.testMe();
		
		if(returned == null)
			fail("No object returned.");

		Class<?> type = returned.getClass();
		if(!type.getName().startsWith("com.kinbiko."))
			fail("New class created in wrong location or not a new custom class");

	}

}
