package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива prices равен: " + prices.length);

        String[]names = new String[4];
        names[0] = "James Hetfield";
        names[1] = "Lars Ulrich";
        names[2] = "Kirk Hammett";
        names[3] = "Jason Newsted";
        System.out.println("Состав группы Metallica (1986-2001): "
                + names[0] + ", " + names[1] + ", "
                + names[2] + ", " + names[3]);
    }
}
