package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void testSum() {
        assertEquals(15, Counter.sum(1, 5));
        assertEquals(0, Counter.sum(3, 1));
        assertEquals(9, Counter.sum(-1, 4));
        assertEquals(165, Counter.sum(10, 20));
        assertEquals(21, Counter.sum(0, 6));
    }

    @Test
    void testSumByEven() {
        assertEquals(6, Counter.sumByEven(1, 5));
        assertEquals(0, Counter.sumByEven(3, 1));
        assertEquals(6, Counter.sumByEven(-1, 4));
        assertEquals(90, Counter.sumByEven(10, 20));
        assertEquals(12, Counter.sumByEven(0, 6));
    }
}