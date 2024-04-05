package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i * 2 + 3;
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}
