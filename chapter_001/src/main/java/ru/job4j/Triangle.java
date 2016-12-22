package ru.job4j;

/**
 * Class Triangle решение задачи 3.1 Площадь треугольника.
 *
 * @author Alexey Tomskih (alexey.tomskih@gmail.com)
 * @version $Id$
 * @since 15.12.2016
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод рассчитывает площадь треугольника.
     * Если точки лежат на одной прямой выдаёт ошибку
     *
     * @return площадь треугольника
     */
    public double area() {
        double result;
        final double EPSILON = 1.0e-10;
        if (Math.abs((a.x - c.x) * (b.y - c.y) - (b.x - c.x) * (a.y - c.y)) <= EPSILON) {
            result = -1;
        } else {
            double resultOne = a.distanceTo(b);
            double resultTwo = b.distanceTo(c);
            double resultThree = a.distanceTo(c);
            double halfPerimeter = (resultOne + resultTwo + resultThree) / 2;
            result = Math.sqrt((halfPerimeter * (halfPerimeter - resultOne) * (halfPerimeter - resultThree) * (halfPerimeter - resultTwo)));
        }
        return result;
    }
}

