package xyz.nighley.euler.utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    public void simple() {
        long[] primes = Prime.primeFactors(13195);
        assertEquals("[5, 7, 13, 29]" , Arrays.toString(primes));
    }

    @Test
    public void complex() {
        long[] primes = Prime.primeFactors(17);
        assertEquals("[17]" , Arrays.toString(primes));
    }

    @Test
    public void isPrime() {
        assertEquals(true, Prime.isPrime(17));
    }

}