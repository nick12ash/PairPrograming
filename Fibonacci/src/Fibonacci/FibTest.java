package Fibonacci;

public class FibTest {

    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int fib(int number) {
        if (number < 0) {
            return - 1;
        }

        if (number < 2) {
            return 1;
        }
            return fib(number - 1) + fib(number - 2);
    }

}

