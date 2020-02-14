package utils;

public class NumberUtils {

    public static int calculateFactorial(int number) {

        if (number < 0)
            return -1;

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }

}
