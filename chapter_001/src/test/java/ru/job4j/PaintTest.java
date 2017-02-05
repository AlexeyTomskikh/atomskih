package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Alexey Tomskih (alexey.tomskih@gmail.com)
 * @version $Id$
 * @since 05.02.2017
 */
public class PaintTest {
    /**
     * Проверка правильности работы метода pyramid.
     * Тест сравнивает полученную строку с ожидаемой
     */
    @Test
    public void pyramidTest() {
        String expectedLine = "    ^\n   ^ ^\n  ^ ^ ^\n ^ ^ ^ ^\n";
        Paint paint = new Paint();
        assertThat(paint.pyramid(4), is(expectedLine));
    }
}
