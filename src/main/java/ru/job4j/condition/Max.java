package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int middle, int left, int right) {
        return max(left, right) > middle ? max(left, right) : middle;
    }

    public static int max(int middle1, int middle2, int left, int right) {
        return max(middle1, left, right) > middle2 ? max(middle1, left, right) : middle2;
    }

    public static void main(String[] args) {
        int result = Max.max(2, 4);
        int res = Max.max(1, 2, 3);
        int rs = Max.max(1, 2, 3, 4);
        System.out.println(result);
        System.out.println(res);
        System.out.println(rs);
    }
}