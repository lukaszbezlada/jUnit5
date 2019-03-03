package com.infoshareacademy.junit.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    @DisplayName("Should return Fizz! if number is divisible by 3")
    void shouldReturnFizz() {
        String result = fizzBuzz.play(9);
        assertEquals(result, "Fizz!");
    }

    @Test
    @DisplayName("Should return Buzz! if number is divisible by 5")
    void shouldReturnBuzz() {
        String result = fizzBuzz.play(20);
        assertEquals(result, "Buzz!");
    }

    @Test
    @DisplayName("Should return FizzBuzz! if number is divisible by 5 and 3")
    void shouldReturnFizzBuzz() {
        String result = fizzBuzz.play(15);
        assertEquals(result, "FizzBuzz!");
    }

    @Test
    @DisplayName("Should return inserted number if number is not divisible by 3 or 5")
    void shouldReturnNumber() {
        String result = fizzBuzz.play(16);
        assertEquals(result, "16");
    }

    @Test
    @DisplayName("Should throw exception if number = 0")
    public void shouldThrowExceptionIfNumberIsZero() {
        assertThrows(ArithmeticException.class, () -> fizzBuzz.play(0));
    }

    @Test
    @DisplayName("Should throw exception if number < 0")
    public void shouldThrowExceptionIfNumberIsLessThanZero() {
        assertThrows(ArithmeticException.class, () -> fizzBuzz.play(-9));
    }

}