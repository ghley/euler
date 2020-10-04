package xyz.nighley.euler.p0;

import org.junit.jupiter.api.Test;
import xyz.nighley.euler.p0.p001_010.*;

import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P00Test {
    @Test
    public void P001() {
        assertEquals(23, P001.getSum(10));
    }

    @Test
    public void P002() {
        assertEquals("44", P002.getSumOfEven(100).toString());
    }

    @Test
    public void P003() {
        assertEquals(29, P003.getLargestPrimeFactor(13195));
    }

    @Test
    public void P004() {
        assertEquals(9009, P004.largestPalindrom(2));
    }

    @Test
    public void P005() {
        assertEquals(2520, P005.findSmallestNumberOfDivisors(LongStream.range(2, 11).toArray()));
    }

    @Test
    public void P006() {
        assertEquals(2640, P006.diff(LongStream.range(1,11).toArray()));
    }

    @Test
    public void P007() {
        assertEquals(13, P007.findXthPrime(6));
    }

    @Test
    public void P008() {
        assertEquals(5832, P008.getMaxConsecutiveProduct(P008.readFile(), 4));
    }

    @Test
    public void P010() {
        assertEquals(17, P010.sumOfPrimesBelow(10));
    }
}
