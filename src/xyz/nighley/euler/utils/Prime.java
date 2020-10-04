package xyz.nighley.euler.utils;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    public static boolean isPrime(long value) {
        long s = 2;
        List<Long> longs = new ArrayList<>();
        while (s <= Math.sqrt(value)) {
            if (value % s == 0) {
                value /= s;
                longs.add(s);
            }else {
                if (s == 2) {
                    s++;
                }else {
                    s += 2;
                }
            }
        }
        if (value != 1) {
            longs.add(value);
            if (longs.size() > 1) {
                return false;
            }
        }
        return true;
    }

    public static long[] primeFactors(long value) {
        long s = 2;
        List<Long> longs = new ArrayList<>();
        while (s <= Math.sqrt(value)) {
            if (value % s == 0) {
                value /= s;
                longs.add(s);
            }else {
                if (s == 2) {
                    s++;
                }else {
                    s += 2;
                }
            }
        }
        if (value != 1) {
            longs.add(value);
        }
        return longs.stream().mapToLong(d->d).toArray();
    }
}
