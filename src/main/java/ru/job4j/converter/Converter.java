package ru.job4j.converter;

public class Converter {
    public static float rubletoEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float inputEuro = 140;
        float expextedEuro = 2;
        float outputEuro = Converter.rubletoEuro(inputEuro);
        boolean passedEuro = expextedEuro == outputEuro;
        float inputDollar = 180;
        float expextedDollar = 3;
        float outputDollar = Converter.rubleToDollar(inputDollar);
        boolean passedDollar = expextedDollar == outputDollar;
        System.out.println("140 rubles are 2. Test result :" + passedEuro);
        System.out.println("180 rubles are 3. Test result :" + passedDollar);
    }
}
