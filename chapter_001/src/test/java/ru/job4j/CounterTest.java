package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void testAdd() {
        Counter counter = new Counter();
        final int result = counter.add(1, 10);
        assertThat(result, is(30));
    }
}
