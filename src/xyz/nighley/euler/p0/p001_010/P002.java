package xyz.nighley.euler.p0.p001_010;

import xyz.nighley.euler.utils.BigNumber;
import xyz.nighley.euler.utils.Problem;

public class P002 extends Problem {

    @Override
    public Object getResult() {
        return getSumOfEven(4000000);
    }

    public static BigNumber getSumOfEven(int max) {
        long f1 = 1;
        long f2 = 2;

        BigNumber sum = new BigNumber(0);

        while (f2 < max) {
            if (f2%2==0) {
                sum = sum.add(new BigNumber(f2));
            }
            long next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        return sum;
    }
}
