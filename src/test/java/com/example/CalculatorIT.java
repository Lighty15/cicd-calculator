package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorIT {
    @Test
    public void addThenDivide() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(calc.add(6, 4), 2));
    }
}