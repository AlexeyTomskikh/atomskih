package ru.job4j;

/**
 * Class Turn решение задачи 5.0 перевернуть массив.
 *
 * @author Alexey Tomskih (alexey.tomskih@gmail.com)
 * @version $Id$
 * @since 25.02.2017
 */
public class Turn {

    /**
     * Метод переворачивает массив.
     *
     * @return перевёрнутый массив
     */
    public static int[] back(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {

            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
        return array;
    }
}
