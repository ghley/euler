package xyz.nighley.euler.p0.p001_010;

import xyz.nighley.euler.utils.Problem;

public class P004 extends Problem {

    public static long largestPalindrom(int digits) {
        long max = (long) Math.pow(10, digits);
        long min = (long) Math.pow(10, digits - 1);
        long largest = 0;
        for (long r = max - 1; r >= min; r--) {
            for (long s = max - 1; s >= min; s--) {
                long v = r * s;
                if (isPalindrom(v)) {
                    largest = Math.max(largest, r * s);
                }
            }
        }
        return largest;
    }

    public static boolean isPalindrom(long num) {
        String text = "" + num;
        for (int q = 0; q < text.length() / 2; q++) {
            if (text.charAt(q) != text.charAt(text.length() - q - 1)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object getResult() {
        return largestPalindrom(3);
    }
}
