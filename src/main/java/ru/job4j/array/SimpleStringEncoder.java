package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
    StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result.append(sumValue(symbol, counter));
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result.append(sumValue(symbol, counter));
        return result.toString();
    }

    public static String sumValue(char symbol, int counter) {
           String result = "";
           result = counter == 1 ? result + symbol : result + symbol + counter;
           return  result;
    }
}