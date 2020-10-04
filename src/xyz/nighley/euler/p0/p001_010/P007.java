package xyz.nighley.euler.p0.p001_010;

import xyz.nighley.euler.utils.Prime;
import xyz.nighley.euler.utils.Problem;

/**
 * Sieve is faster, but not worth implementing here.
 */
public class P007 extends Problem {

    @Override
    public Object getResult() {
        return findXthPrime(10001);
    }

    public static long findXthPrime(int num) {
        int count = 1;
        for (int q = 3; q < Integer.MAX_VALUE; q+=2) {
            if (Prime.isPrime(q)) {
                count++;
                if (count == num) {
                    return q;
                }
            }
        }
        throw new RuntimeException("Integer.MAX_VALUE reached.");
    }
}
