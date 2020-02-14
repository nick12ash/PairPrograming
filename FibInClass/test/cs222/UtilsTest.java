package cs222;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void calculateFibonacci0() {
        assertEquals(1, Utils.calculateFibonacciRecursive(0));
    }

    @Test
    void calculateFibonacci1() {
        assertEquals(1, Utils.calculateFibonacciRecursive(1));
    }

    @Test
    void calculateFibonacciMin1() {
        assertEquals(-1, Utils.calculateFibonacciRecursive(-1));
    }

    @Test
    void calculateFibonacciIterative5() {
        assertEquals(8, Utils.calculateFibonacciIterative(5));
    }

    @Test
    void calculateFibonacciPositiveNumbers() {
        assertEquals(89, Utils.calculateFibonacciRecursive(10));
        assertEquals(8, Utils.calculateFibonacciRecursive(5));
    }

    @Test
    void compareTwoFibonacciFunctions() {
        for (int i = 0; i < 10; i++) {
            assertEquals(Utils.calculateFibonacciRecursive(i), Utils.calculateFibonacciIterative(i), "Fibonacci(" + i + ") failed!");
        }
    }
}