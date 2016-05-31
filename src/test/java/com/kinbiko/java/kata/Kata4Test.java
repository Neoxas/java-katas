package com.kinbiko.java.kata;

import org.junit.Test;

import static org.junit.Assert.*;

/*
 * Write a class with a method getColourInstance() that returns a Colour object,
 * with a method which returns the name of the colour. The first time the
 * getColourInstance is called it shall return an instance of a class named Red,
 * the second time Blue, and the third, and any further invocations it shall
 * return an instance of a class called Green.
 * These classes should have methods that return 'Red', 'Blue' and 'Green' respectively.
 *
 * This kata serves to illustrate the power of an Object Oriented Programming
 * principle known as polymorphism, and this is truly where the power of OOP
 * comes from.
 */

public class Kata4Test{
	
	private static final String RED = "Red";
	private static final String BLUE = "Blue";
	private static final String GREEN = "Green";
	
	Kata4 target = new Kata4();

	@Test
	public void testReturnsRedBlueGreenGreenGreen(){
		doTest(target.getColourInstance(), RED);
		doTest(target.getColourInstance(), BLUE);
		doTest(target.getColourInstance(), GREEN);
		doTest(target.getColourInstance(), GREEN);
		doTest(target.getColourInstance(), GREEN);
	}

	private void doTest(Colour col, String colourName){
        assertNotNull(col);
		assertEquals(col.getColourName(), colourName);
		assertTrue(col.getClass().getName().contains(colourName));
	}

}
