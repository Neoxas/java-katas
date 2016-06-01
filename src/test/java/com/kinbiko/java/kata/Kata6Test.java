package com.kinbiko.java.kata;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * This kata serves to demonstrate the use of try/catch/finally, and to introduce the notion of exceptions.
 * It is expected that you'll need to look up what some of these terms mean if this is new to you.
 *
 * 1: In addition to the Kata6 file, create two exception classes in the main folder
 *    - One checked exception,
 *    - One unchecked exception
 * 2: Make a method in Kata6 called void couldThrowExceptions(String), and implement it so that when
 *  given a String containing "unchecked" it will throw the unchecked exception created in 1:, and
 *  when given a String contained "checked" it will throw the checked exception.
 * 
 * 3: Make a second method Exception handlingExceptions(String), which forwards the parameters to
 * couldThrowExceptions(String), but will never throw the exceptions any further, neither the
 * checked nor the unchecked one. However, if the handlingExceptions throws an exception this
 * should be returned (not thrown), and null should be returned if no exceptions are thrown
 * from couldThrowExceptions.
 */
public class Kata6Test {

    Kata6 target = new Kata6();

    @Test
    public void testDoesNotThrowWhenGivenNull() throws Exception {
        target.couldThrowExceptions(null);
    }

    @Test
    public void testDoesNotThrowWhenGivenCleanString() throws Exception {
        target.couldThrowExceptions("fishface");
    }

    @Test(expected = RuntimeException.class)
    public void testDoesThrowUnchecked() throws Exception {
        target.couldThrowExceptions("unchecked");
    }

    @Test(expected = Exception.class)
    public void testDoesThrowChecked() throws Exception {
        target.couldThrowExceptions("checked");
    }

    @Test
    public void testHandlesUncheckedExceptions(){
        final RuntimeException excp = (RuntimeException) target.handlingExceptions("unchecked");
        assertTrue(excp.getClass().getName().contains("com.kinbiko.java.kata."));
    }

    @Test public void testHandlesCheckedExceptions(){
        final Exception excp = target.handlingExceptions("unchecked");
    }


}

