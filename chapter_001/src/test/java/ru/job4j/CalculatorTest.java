package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexey Tomskih (alexey.tomskih@gmail.com)
 * @version $Id$
 * @since 03.12.2016
 */

public class CalculatorTest {
    /**
     * Тест сложения.
     */
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        final double result = calc.getResult();
        assertThat(result, is(2d));
    }

    /**
     * Тест вычитания.
     */
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        calc.subtract(1, 1);
        final double result = calc.getResult();
        assertThat(result, is(0d));
    }
    /**
     * Тест умножения.
     */
    @Test
    public void testMultiple() {
        Calculator calc = new Calculator();
        calc.multiple(1, 1);
        final double result = calc.getResult();
        assertThat(result, is(1d));
    }
    /**
     * Тест деления.
     */
    @Test
    public void testDiv() {
        Calculator calc = new Calculator();
        calc.div(1, 1);
        final double result = calc.getResult();
        assertThat(result, is(1d));
    }
}