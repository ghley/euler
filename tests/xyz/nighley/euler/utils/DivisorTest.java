package xyz.nighley.euler.utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class DivisorTest {
    @Test
    public void test() {
        assertEquals("[1, 2, 4, 7, 14, 28]", Arrays.toString(Arrays.stream(Divisor.getAllDivisors(28)).sorted().toArray()));
    }
}