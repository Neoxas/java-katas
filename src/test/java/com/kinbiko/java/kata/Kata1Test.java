package com.kinbiko.java.kata;

import org.junit.Test;

import static org.junit.Assert.*;

/*
 * This kata serves as an introduction to the build system called Maven.
 * - install maven (jfgi)
 * - in the root folder of this project, run the command 'mvn clean verify' (read: maven clean verify)
 *   on your command line.
 * If done correctly, this will display a message saying that the build failed because you have test failure.
 * This is common practice. Your build is considered failing if it doesn't pass its tests, or if you have
 * compile errors in your code.
 *
 * Write fill out the Kata classes to make the tests pass. Do NOT edit the test.
 *
 * I recommend using an IDE like Eclipse or IntelliJ IDEA to run individual tests, as it can be a bit of pain
 * doing so with Maven(made for professional projects, not this kind of training).
 */

/*
 * Write a class that has a method called getMyProperty() which returns a String
 * containing the phrase 'it worked!"
 */
public class Kata1Test{
    Kata1 target = new Kata1();

    @Test
    public void testGetMyProperty(){
        assertTrue(target.getMyProperty().contains("it worked!"));
    }
}
