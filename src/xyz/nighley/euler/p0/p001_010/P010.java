package xyz.nighley.euler.p0.p001_010;

import xyz.nighley.euler.utils.Problem;

import java.util.Arrays;
import java.util.stream.IntStream;

public class P010 extends Problem {

    @Override
    public Object getResult() {
        return sumOfPrimesBelow(2000000);
    }

    public static long sumOfPrimesBelow(int max) {
        int[] sieve = IntStream.range(0, max).toArray();
        sieve[1] = 0;
        for (int q = 2; q < max; q++) {
            if (sieve[q] == 0) {
                continue;
            }
            for (int r = q+q; r < max; r+=q) {
                sieve[r] = 0;
            }
        }
        return Arrays.stream(sieve).mapToLong(i->i).sum();
    }
}
