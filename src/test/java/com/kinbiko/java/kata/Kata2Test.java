package com.kinbiko.java.kata;

import com.kinbiko.java.kata.solutions.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class Kata2Test{
    //Kata1 target = new Kata2(); 
    Kata1Solution target = new Kata2Solution();

    @Test
    public void testGetMyProperty(){
        assertTrue(target.getMyProperty().contains("overriding getMyProperty"));
    }
}
