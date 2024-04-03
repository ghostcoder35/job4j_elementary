package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (; start <= finish; start++) {
            sum += start;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(12, 18));
        System.out.println(sum(100, 200));
        System.out.println(sum(55, 88));
    }
}