package com.infoshareacademy.junit.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RangeTest {

    private Range range;

    @BeforeEach
    public void initRange() {
        range = new Range(10, 20);

        System.out.println("BeforeEach");
    }

    @Test
    public void shouldReturnTrueIfNumberInRange() {

        boolean result = range.isInRange(15);

        assertTrue(result, "Number is outside range!");
    }

    @Test
    public void shouldReturnFalseIfNumberIsNotInRange() {

        boolean result = range.isInRange(21);

        assertFalse(result, "Number is in range!");
    }
}