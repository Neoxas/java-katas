package com.kinbiko.java.kata;

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
public class Kata4
{
    Colour color;
    
    Colour getColourInstance()
    {
    	if( color == null )
    	{
    		color = new Red();
    	}
    	else if ( color instanceof Red )
    	{
    		color = new Blue();
    	}
    	else
    	{
    		color = new Green();
    	}

    	return color;
    }
}

class Red implements Colour
{
	public String getColourName()
	{
		return "Red";
	}
}

class Blue implements Colour
{
	public String getColourName()
	{
		return "Blue";
	}
}

class Green implements Colour
{
	public String getColourName()
	{
		return "Green";
	}
}