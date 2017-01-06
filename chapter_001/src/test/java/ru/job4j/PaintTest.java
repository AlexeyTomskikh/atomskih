package ru.job4j;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {

    @org.junit.Test
    public void piramidTest() {
        String expectedLine = "1111^\n111^2^\n11^2^2^\n1^2^2^2^\n";
        Paint paint = new Paint();
        //System.out.println(paint.piramid(3));
        assertThat(paint.piramid(4), is(expectedLine));
    }
}
