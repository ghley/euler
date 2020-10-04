package xyz.nighley.euler.p0.p001_010;

import xyz.nighley.euler.utils.Problem;

public class P009 extends Problem {

    @Override
    public Object getResult() {
        for (long a = 1; a < 997; a++) {
            for (long b = a + 1; b < 998; b++) {
                long c = 1000 - a - b;
                if (isTriplet(a, b, c)) {
                    return a * b *c;
                }
            }
        }
        throw new RuntimeException("FAILED");
    }

    public static boolean isTriplet(long a, long b, long c) {
        return a < b && b < c && a * a + b * b == c * c;
    }
}
