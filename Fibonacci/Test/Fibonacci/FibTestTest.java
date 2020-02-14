package Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibTestTest {

    @Test
    void fibpositive() {
        assertEquals(8,FibTest.fib(5));
        assertEquals(13,FibTest.fib(6));
    }

    @Test
    void fib0() {
        assertEquals(1,FibTest.fib(1));
    }

    @Test
    void fib1() {
        assertEquals(1,FibTest.fib(0));
    }

    @Test
    void fibnegative1() {
        assertEquals(-1,FibTest.fib(-1));
    }
}