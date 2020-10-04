package xyz.nighley.euler.p0.p011_020;

import xyz.nighley.euler.utils.Divisor;
import xyz.nighley.euler.utils.Problem;

public class P012 extends Problem {

    @Override
    public Object getResult() {
        return getTriangleNumberWithOverXDivisors(500);
    }

    public static long getTriangleNumberWithOverXDivisors(int num) {
        long c = 1;
        long sum = 0;
        while (c < Long.MAX_VALUE) {
            sum += c++;
            int divisors = Divisor.getAllDivisors(sum).length;
            if (divisors > num) {
                return sum;
            }
        }
        throw new RuntimeException("FAILED");
    }
}
