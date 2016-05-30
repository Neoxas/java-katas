package com.kinbiko.java.kata.solutions;

import com.kinbiko.java.kata.InvocationCounter;

public class Kata3Solution implements InvocationCounter{

	int count;

	public int getTwiceTimesInvoked() {
		return ++count * 2;
	}
}
