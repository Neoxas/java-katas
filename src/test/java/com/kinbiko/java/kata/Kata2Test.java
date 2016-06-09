package com.kinbiko.java.kata;

import org.junit.Test;

import static org.junit.Assert.*;

/*
 * Write a class, which inherits all the properties of Kata1, but
 * overrides its getMyProperty() method, returning a string that
 * contains the phrase 'overriding getMyProperty'.
 */
public class Kata2Test{
    Kata1 target = new Kata2();
    //Kata1Solution target = new Kata2Solution();

    @Test
    public void testGetMyProperty(){
        assertTrue(target.getMyProperty().contains("overriding getMyProperty"));
    }
}
