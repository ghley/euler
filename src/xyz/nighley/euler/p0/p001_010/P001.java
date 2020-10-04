package xyz.nighley.euler.p0.p001_010;

import xyz.nighley.euler.utils.Problem;

public class P001 extends Problem {

    @Override
    public Object getResult() {
        return getSum(1000);
    }

    public static long getSum(int max) {
        long sum = 0;
        for (int q = 0; q < max; q+= 3) {
            if (q % 5 != 0) {
                sum += q;
            }
        }
        for (int q = 0; q < max; q+=5) {
            sum += q;
        }
        return sum;
    }

}
