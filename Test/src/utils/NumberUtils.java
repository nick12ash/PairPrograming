package utils;

public class NumberUtils {

    public static int calculateFactorial(int number) {
        int results = 1;
        for(int i =1 ; i <= number; i++) {
            results *= i;
        }
        return results;

    }

}
