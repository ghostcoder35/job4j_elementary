package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void test() {
        assertEquals(15, Counter.sum(1, 5));
        assertEquals(0, Counter.sum(3, 1));
        assertEquals(9, Counter.sum(-1, 4));
        assertEquals(165, Counter.sum(10, 20));
        assertEquals(21, Counter.sum(0, 6));
    }

}
