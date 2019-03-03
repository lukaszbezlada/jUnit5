package com.infoshareacademy.junit.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnFizz() {
        String result = fizzBuzz.play(9);
        assertEquals(result, "Fizz!");
    }

    @Test
    public void shouldReturnBuzz() {
        String result = fizzBuzz.play(20);
        assertEquals(result, "Buzz!");
    }

    @Test
    public void shouldReturnFizzBuzz() {
        String result = fizzBuzz.play(15);
        assertEquals(result, "FizzBuzz!");
    }

    @Test
    public void shouldReturnNumber() {
        String result = fizzBuzz.play(16);
        assertEquals(result, "16");
    }
}