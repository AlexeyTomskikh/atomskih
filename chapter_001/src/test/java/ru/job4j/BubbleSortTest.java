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
public class BubbleSortTest {

    /**
     * Проверка правильности работы метода sorting, который сортирует массив пузырьком.
     * Тест сравнивает полученный массив с ожидаемым
     */
    @Test
    public void sorting() throws Exception {

        int[] values = {3, 5, 7, 9, 6, 4, 11};
        BubbleSort bubbleSort = new BubbleSort();
        int[] resultArray = bubbleSort.sorting(values);
        int[] expectArray = {3, 4, 5, 6, 7, 9, 11};
        assertThat(resultArray, is(expectArray));
    }
}