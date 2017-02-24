package ru.job4j;

/**
 * Class BubbleSort решение задачи 5.1 Сортировка пузырьком.
 *
 * @author Alexey Tomskih (alexey.tomskih@gmail.com)
 * @version $Id$
 * @since 25.02.2017
 */
public class BubbleSort {

    public int[] sorting(int[] values) {

        for (int i = 0; i < values.length - 1; i++) {
            int count = 0;
            for (int j = values.length - 1; j > i; j--) {

                if (values[j - 1] > values[j]) {
                    int temp = values[j - 1];
                    values[j - 1] = values[j];
                    values[j] = temp;
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
        }
        return values;
    }
}
