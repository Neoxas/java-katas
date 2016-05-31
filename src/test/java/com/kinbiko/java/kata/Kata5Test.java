package com.kinbiko.java.kata;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Research and implement the Singleton pattern(*).
 * This class should in addition have a boolean isSame(Kata5) method that returns true iff the object provided to the
 * class is exactly the same object as the singleton instance.
 *
 * (*) political opinion pending.
 */

public class Kata5Test {

    private Kata5 target = Kata5.getInstance();

    @Test
    public void testIsSingleton() {
        assertSame(Kata5.getInstance(), target);
    }

    @Test
    public void isSame(){
        assertTrue(target.isSame(target));
    }

    @Test
    public void testDifferentWhenNull(){
        assertFalse(target.isSame(null));
    }

    @Test
    public void testDifferentWhenDifferentObject(){
        assertFalse(target.isSame(mock(Kata5.class)));
    }
}