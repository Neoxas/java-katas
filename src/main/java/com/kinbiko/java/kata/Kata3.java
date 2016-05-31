package com.kinbiko.java.kata;

import com.kinbiko.java.kata.InvocationCounter;

/*
 * Write a class implementing an interface InvocationCounter, with a method which returns 
 * twice the number of times this method has been called.
 */
public class Kata3 implements InvocationCounter
{
	public int count = 0;

	public int getTwiceTimesInvoked()
	{
		return ++count * 2;
	}
}
