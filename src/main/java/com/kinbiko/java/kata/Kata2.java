package com.kinbiko.java.kata;

/*
 * Write a class, which inherits all the properties of Kata1, but
 * overrides its getMyProperty() method, returning a string that
 * contains the phrase 'overriding getMyProperty'.
 */
public class Kata2 extends Kata1 {
    public String getMyProperty()
    {
    	return "overriding getMyProperty";
    }
}
