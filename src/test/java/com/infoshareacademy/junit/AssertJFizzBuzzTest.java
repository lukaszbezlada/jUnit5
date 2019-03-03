package com.infoshareacademy.junit;

import com.infoshareacademy.junit.task2.FizzBuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AssertJFizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    @DisplayName("Should return FizzBuzz! if number is divisible by 3 and 5")
    public void shouldReturnFizzBuzz() {
        String result = fizzBuzz.play(15);
        assertThat(result)
                .isEqualTo("FizzBuzz!")
                .isNotNull()
                .isNotEqualTo("Buzz!")
                .isNotEqualTo("Fizz!")
                .withFailMessage("Something went wrong!");
    }

    @Test
    @DisplayName("Should return Buzz! if number is divisible by 5")
    public void shouldReturnBuzzWhen5() {
        String result = fizzBuzz.play(5);
        assertThat(result).isEqualTo("Buzz!");
    }

    @Test
    @DisplayName("Should return inserted number if number is not divisible by 3 or 5")
    void shouldReturnNumber() {
        String result = fizzBuzz.play(16);
        assertThat(result).isEqualTo("16");
    }

    @Test
    public void shouldThrowExceptionForNegative() {
        int number = -1;
        assertThatThrownBy(() -> fizzBuzz.play(number))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Number can not be 0 or negative!");
    }
}
