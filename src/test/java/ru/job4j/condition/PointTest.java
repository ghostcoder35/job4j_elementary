package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to21then1dot41() {
        double expected = 1.41;
        Point a = new Point(1, 2);
        Point b = new Point(2, 1);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when22to22then0() {
        double expected = 0;
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus12to13then2dot23() {
        double expected = 2.23;
        Point a = new Point(-1, 2);
        Point b = new Point(1, 3);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}