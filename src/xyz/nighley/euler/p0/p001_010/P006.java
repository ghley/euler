package xyz.nighley.euler.p0.p001_010;

import xyz.nighley.euler.utils.Problem;

import java.util.Arrays;
import java.util.stream.LongStream;

public class P006 extends Problem {

    @Override
    public Object getResult() {
        return diff(LongStream.range(1,101).toArray());
    }

    public static long diff(long[] nums) {
        return squaresOfSums(nums) - sumOfSquares(nums);
    }

    public static long sumOfSquares(long[] nums) {
        return Arrays.stream(nums).map(v->v*v).sum();
    }

    public static long squaresOfSums(long[] nums) {
        return (long)Math.pow(Arrays.stream(nums).sum(),2);
    }
}
