package ru.job4j;

/**
 * Class Paint решение задачи 4.3. Построить пирамиду в псевдографике.
 *
 * @author Alexey Tomskih (alexey.tomskih@gmail.com)
 * @version $Id$
 * @since 05.01.2017
 */

public class Paint {
    /**
     * Метод строит пирамиду заданной высоты.
     *
     * @param h высота пирамиды
     * @return возвращает строку с пирамидой заданой высоты
     */
    public String pyramid(int h) {
        StringBuilder line1 = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = i; j < h; j++) {
                line1.append(" ");
            }
            for (int k = 0; k <= i; k++) {
                line1.append("^");
                if (k < i) {
                    line1.append(" ");
                } else {
                    line1.append("\n");
                }
            }
        }
        return line1.toString();
    }
}
