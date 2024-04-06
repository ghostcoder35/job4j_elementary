package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int i = 0; i < prefix.length; i++) {
            result = word[i] == prefix[i];
            if (!result) {
                break;
            }
        }
        return result;
    }
}