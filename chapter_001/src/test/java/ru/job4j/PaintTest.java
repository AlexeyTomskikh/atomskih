package ru.job4j;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {

    @org.junit.Test
    public void piramidTest() {
        String expectedLine = "    ^\n   ^ ^\n  ^ ^ ^\n ^ ^ ^ ^\n";
        Paint paint = new Paint();
        assertThat(paint.piramid(4), is(expectedLine));
    }
}
