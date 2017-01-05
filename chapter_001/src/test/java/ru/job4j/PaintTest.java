package ru.job4j;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {

    @org.junit.Test
    public void piramidTest() throws Exception {

        Paint paint = new Paint();
        String line = paint.piramid(3);
        int lengthString = line.length();
        assertThat(lengthString, is(6));
    }
}
