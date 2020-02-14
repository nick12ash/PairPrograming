package cs222;

public class Utils {

    public static int calculateFibonacciRecursive(int number) {

        if (number < 0)
            return -1;

        if (number <= 1)
            return 1;

        return calculateFibonacciRecursive(number - 1) + calculateFibonacciRecursive(number - 2);
    }

    public static int calculateFibonacciIterative(int number) {

        if (number < 0)
            return -1;

        if (number <= 1)
            return 1;

        int onePreviousNumber = 1;
        int twoPreviousNumber = 1;
        int nextNumber = 0;

        for (int i = 2; i <= number; i++) {
            nextNumber = Add(onePreviousNumber, twoPreviousNumber);
            twoPreviousNumber = onePreviousNumber;
            onePreviousNumber = nextNumber;
        }

        return nextNumber;
    }

    public static int Add(int X, int Y) {
        return X + Y;
    }

    public static void main(String[] args) {
        System.out.println(calculateFibonacciIterative(10));
    }

}
