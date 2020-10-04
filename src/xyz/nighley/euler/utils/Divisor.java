package xyz.nighley.euler.utils;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Divisor {

    public static long[] getAllDivisors(long value) {
        long[] primes = Prime.primeFactors(value);
        Set<Long> longSet = LongStream.range(1, (long)Math.pow(2, primes.length)).map(i->{
            long val = 1;
            for (int q = 0; q < primes.length; q++) {
                if ((i & 1) == 1) {
                    val *= primes[q];
                }
                i >>= 1;
            }
            return val;
        }).mapToObj(i->i).collect(Collectors.toSet());
        longSet.add(1L);
        longSet.add(value);
        return longSet.stream().mapToLong(i->i).toArray();
    }
}
