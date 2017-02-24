package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexey Tomskih (alexey.tomskih@gmail.com)
 * @version $Id$
 * @since 25.02.2017
 */
public class TurnTest {
    /**
     * Проверка правильности работы метода back, который разворачивает массив.
     * Тест сравнивает полученный массив с ожидаемым
     */
    @Test
    public void back() throws Exception {

        int[] array = {1, 2, 3, 4, 5};
        int[] expectArray = {5, 4, 3, 2, 1};

        Turn turn = new Turn();
        int[] resultArray = turn.back(array);
        assertThat(resultArray, is(expectArray));
    }
}