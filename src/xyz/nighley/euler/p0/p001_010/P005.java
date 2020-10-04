package xyz.nighley.euler.p0.p001_010;

import xyz.nighley.euler.utils.Problem;

import java.util.Arrays;
import java.util.stream.LongStream;

public class P005 extends Problem {

    @Override
    public Object getResult() {
        return findSmallestNumberOfDivisors(LongStream.range(2,21).toArray());
    }

    public static long findSmallestNumberOfDivisors(long[] nums) {
        long mult = Arrays.stream(nums).reduce((v1,v2)->v1*v2).getAsLong();
        for (int q = nums.length-1; q >= 0; q--) {
            long div = mult / nums[q];
            boolean isDivisible = true;
            for (int r = 0; r < nums.length; r++) {
                if (div % nums[r] != 0) {
                    isDivisible = false;
                    break;
                }
            }
            if (isDivisible) {
                mult = div;
                q++;
            }
        }
        return mult;
    }
}
