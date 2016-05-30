package com.kinbiko.java.kata;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kinbiko.java.kata.solutions.*;

public class Kata4Test{
	
	private static final String RED = "Red";
	private static final String BLUE = "Blue";
	private static final String GREEN = "Green";
	
	Kata4 target = new Kata4();
	//	Kata4Solution target = new Kata4Solution();
	
	@Test
	public void testReturnsRedBlueGreenGreenGreen(){
		doTest(target.getColourInstance(), RED);
		doTest(target.getColourInstance(), BLUE);
		doTest(target.getColourInstance(), GREEN);
		doTest(target.getColourInstance(), GREEN);
		doTest(target.getColourInstance(), GREEN);
	}

	private void doTest(Colour col, String colourName){
		assertEquals(col.getColourName(), colourName);
		assertTrue(col.getClass().getName().contains(colourName));
	}

}
