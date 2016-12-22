package ru.job4j;

import org.junit.Test;


import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Алексей on 22.12.2016.
 */
public class MaxTest {
    @Test
    public void max() throws Exception {

        Max max = new Max();
        int result = max.maxNumber(2156, -11);
        assertThat(result, is(2156));
    }
    @Test
    public void max2() throws Exception {

        Max max = new Max();
        int result = max.maxNumber(1, 3);
        assertThat(result, is(3));
    }
}