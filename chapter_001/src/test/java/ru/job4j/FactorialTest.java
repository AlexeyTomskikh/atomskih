package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void testCalculateFactorial() {
        Factorial factorial = new Factorial();
        final int result = factorial.calculateFactorial(5);
        assertThat(result, is(120));
    }
}
