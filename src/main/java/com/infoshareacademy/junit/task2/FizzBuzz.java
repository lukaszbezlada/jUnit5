package com.infoshareacademy.junit.task2;

public class FizzBuzz {
    public String play(int number) {

        if (number <= 0) {
            throw new ArithmeticException("Number can not be 0 or negative!");
        }

        if (number % 3 == 0 && number % 5 != 0)
            return "Fizz!";
        else if (number % 5 == 0 && number % 3 != 0)
            return "Buzz!";
        else if (number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz!";
        else
            return Integer.toString(number);
    }
}
