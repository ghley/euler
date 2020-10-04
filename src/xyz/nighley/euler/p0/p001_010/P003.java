package xyz.nighley.euler.p0.p001_010;

import xyz.nighley.euler.utils.Prime;
import xyz.nighley.euler.utils.Problem;

public class P003 extends Problem {

    @Override
    public Object getResult() {
        return getLargestPrimeFactor(600851475143L);
    }

    public static long getLargestPrimeFactor(long number) {
        long[] num = Prime.primeFactors(number);
        return num[num.length-1];
    }
}
