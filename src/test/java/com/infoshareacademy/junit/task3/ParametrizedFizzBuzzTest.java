package com.infoshareacademy.junit.task3;

import com.infoshareacademy.junit.task2.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Parametric tests for FizzBuzz")
public class ParametrizedFizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @DisplayName("Should return Fizz! if number is divisible by 3")
    @ParameterizedTest(name = "{0} - should be divisible by 3")
    @ValueSource(ints = {3, 6, 9, 99})
    public void verifyIfReturnsBuzzWhenDivisible3(int number) {

        String expectedResult = "Fizz!";

        String actualResult = fizzBuzz.play(number);

        assertEquals(expectedResult, actualResult);
    }

}
