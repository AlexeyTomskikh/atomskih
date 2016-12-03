package ru.job4j;

/**
 * Class Calculator решение задачи 2.3 Создать калькулятор.
 *
 * @author Alexey Tomskih (alexey.tomskih@gmail.com)
 * @version $Id$
 * @since 03.12.2016
 */
public class Calculator {
    /**
     * Values.
     */
    private double result;
    /**
     * Сложение.
     * @param first  первый аргумент
     * @param second второй аргумент
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Вычитание.
     * @param first  первый аргумент
     * @param second второй аргумент
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     * Умножение.
     * @param first  первый аргумент
     * @param second второй аргумент
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /**
     * Деление.
     * @param first  первый аргумент
     * @param second второй аргумент
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * Метод возвращает результат.
     * @return result результат
     */
    public double getResult() {
        return result;
    }
}