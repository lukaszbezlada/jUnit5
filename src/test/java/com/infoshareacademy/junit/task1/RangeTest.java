package com.infoshareacademy.junit.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RangeTest {

    @Test
    public void shouldReturnTrueIfNumberInRange() {
        Range range = new Range(10, 20);

        boolean result = range.isInRange(15);

        assertTrue(result, "Number is outside range!");
    }

    @Test
    public void shouldReturnFalseIfNumberIsNotInRange() {
        Range range = new Range (10, 20);

        boolean result = range.isInRange(21);

        assertFalse(result, "Number is in range!");
    }
}