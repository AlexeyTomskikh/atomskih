package ru.job4j;

/**
 * Class Point решение задачи 3.1 Площадь треугольника.
 *
 * @author Alexey Tomskih (alexey.tomskih@gmail.com)
 * @version $Id$
 * @since 22.12.2016
 */

public class Point {

    public double x;
    public double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Расстояние между двумя точками.
     *
     * @param point точка расстояние до которой требуется рассчитать
     * @return возвращает расстояние между точками
     */
    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow((point.x - this.x), 2) + Math.pow((point.y - this.y), 2));
    }
}

