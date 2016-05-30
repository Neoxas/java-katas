package com.kinbiko.java.kata;

import com.kinbiko.java.kata.solutions.Kata1Solution;
import static org.junit.Assert.*;
import org.junit.Test;

public class Kata1Test{
    Kata1 target = new Kata1(); 
    //Kata1Solution target = new Kata1Solution();

    @Test
    public void testGetMyProperty(){
        assertTrue(target.getMyProperty().contains("it worked!"));
    }
}
