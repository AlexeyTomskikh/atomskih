package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Test.
 * @author Alexey Tomskih (alexey.tomskih@gmail.com)
 * @version $Id$
 * @since 19.12.2016
 */

public class TriangleTest {
    /**
     * Тест метода вычисления площади треугольника.
     */
    @Test
    public void areaTest() {

		Point onePoint = new Point(2, 5);
		Point twoPoint = new Point(7, 1);
		Point threePoint = new Point(8, 10);
        Triangle triangle = new Triangle(onePoint, twoPoint, threePoint);
        assertThat(triangle.area(), closeTo(24.5, 0.01));
    }
    /**
     * Тест метода вычисления расстояния между двумя точками.
     */
    @Test
    public void distanceToTest() {

        Point onePoint = new Point(2, 5);
        Point twoPoint = new Point(7, 1);
        assertThat(onePoint.distanceTo(twoPoint), closeTo(6.4, 0.01));
    }
}