package com.kinbiko.java.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Kata7TestInteger extends Kata7Test {

    private static final int A = (int) (Math.random() * 500);
    private static final int B = (int) (Math.random() * 500);
    private static final int SUM = A + B;
    private static final int DIFFERENCE = A - B;
    private static final int PRODUCT = A * B;
    private static final int QUOTIENT = A / B; //assuming B != 0.

    @Test
    public void testPrimitiveInteger(){
        assertEquals(SUM, target.doPrimitiveIntegerAdd(A,B));
        assertEquals(DIFFERENCE, target.doPrimitiveIntegerSubtract(A,B));
        assertEquals(PRODUCT, target.doPrimitiveIntegerMultiply(A,B));
        assertEquals(QUOTIENT, target.doPrimitiveIntegerDivide(A,B));
    }

    @Test
    public void testObjectInteger(){
        assertEquals((Integer) SUM, target.doObjectIntegerAdd(A,B));
        assertEquals((Integer) DIFFERENCE, target.doObjectIntegerSubtract(A,B));
        assertEquals((Integer) PRODUCT, target.doObjectIntegerMultiply(A,B));
        assertEquals((Integer) QUOTIENT, target.doObjectIntegerDivide(A,B));

        assertNull(target.doObjectIntegerAdd(A,null));
        assertNull(target.doObjectIntegerSubtract(A,null));
        assertNull(target.doObjectIntegerMultiply(A,null));
        assertNull(target.doObjectIntegerDivide(A,null));

        assertNull(target.doObjectIntegerAdd(null, A));
        assertNull(target.doObjectIntegerSubtract(null, A));
        assertNull(target.doObjectIntegerMultiply(null, A));
        assertNull(target.doObjectIntegerDivide(null, A));

        assertNull(target.doObjectIntegerAdd(null, null));
        assertNull(target.doObjectIntegerSubtract(null, null));
        assertNull(target.doObjectIntegerMultiply(null, null));
        assertNull(target.doObjectIntegerDivide(null, null));
    }
}
