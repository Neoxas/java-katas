package com.kinbiko.java.kata;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * In Kata7, create a methods:
 * 1) boolean flipPrimitiveBoolean(boolean), which should return the opposite of the provided boolean.
 *      E.g. if given false it should return true, and if given true it should return false.
 * 2) boolean doPrimitiveBooleanOr(boolean, boolean), which should return true if either of the two
 *      provided arguments are true, and false if both are false.
 * 3) boolean doPrimitiveBooleanAnd(boolean, boolean), which should return true only if both arguments
 *      are true, false otherwise.
 *
 *
 * 4) Boolean flipObjectBoolean, which should do the same as 1), except when given null it shall return null.
 * 5) Boolean doObjectBooleanOr, which should do the same as 2), except when any argument is null it shall return null.
 * 6) Boolean doObjectBooleanAnd, which should do the same as 3), except when any argument is null, it shall return null.
 */
public class Kata7TestBoolean extends Kata7Test {

    //boolean tests
    @Test
    public void testPrimitiveBoolean(){
        //Not operator
        assertFalse(target.flipPrimitiveBoolean(true));
        assertTrue(target.flipPrimitiveBoolean(false));

        //Or operator
        assertTrue(target.doPrimitiveBooleanOr(true, true));
        assertTrue(target.doPrimitiveBooleanOr(false, true));
        assertTrue(target.doPrimitiveBooleanOr(true, false));
        assertFalse(target.doPrimitiveBooleanOr(false, false));

        //And operator
        assertTrue(target.doPrimitiveBooleanAnd(true, true));
        assertFalse(target.doPrimitiveBooleanAnd(false, true));
        assertFalse(target.doPrimitiveBooleanAnd(true, false));
        assertFalse(target.doPrimitiveBooleanAnd(false, false));
    }

    @Test
    public void testObjectBoolean(){
        assertFalse(target.flipObjectBoolean(Boolean.TRUE));
        assertTrue(target.flipObjectBoolean(Boolean.FALSE));
        assertNull(target.flipObjectBoolean(null));

        //Or operator
        assertTrue(target.doObjectBooleanOr(Boolean.TRUE, Boolean.TRUE));
        assertTrue(target.doObjectBooleanOr(Boolean.FALSE, Boolean.TRUE));
        assertTrue(target.doObjectBooleanOr(Boolean.TRUE, Boolean.FALSE));
        assertFalse(target.doObjectBooleanOr(Boolean.FALSE, Boolean.FALSE));
        //Test sane behaviour for null input
        assertNull(target.doObjectBooleanOr(null,null));
        assertNull(target.doObjectBooleanOr(Boolean.TRUE,null));
        assertNull(target.doObjectBooleanOr(null,Boolean.TRUE));
        assertNull(target.doObjectBooleanOr(Boolean.FALSE,null));
        assertNull(target.doObjectBooleanOr(null, Boolean.FALSE));

        //And operator
        assertTrue(target.doObjectBooleanAnd(Boolean.TRUE, Boolean.TRUE));
        assertFalse(target.doObjectBooleanAnd(Boolean.FALSE, Boolean.TRUE));
        assertFalse(target.doObjectBooleanAnd(Boolean.TRUE, Boolean.FALSE));
        assertFalse(target.doObjectBooleanAnd(Boolean.FALSE, Boolean.FALSE));
        //Test sane behaviour for null input
        assertNull(target.doObjectBooleanAnd(null,null));
        assertNull(target.doObjectBooleanAnd(Boolean.TRUE,null));
        assertNull(target.doObjectBooleanAnd(null,Boolean.TRUE));
        assertNull(target.doObjectBooleanAnd(Boolean.FALSE,null));
        assertNull(target.doObjectBooleanAnd(null, Boolean.FALSE));

    }


}
