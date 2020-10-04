package xyz.nighley.euler.utils;

import java.util.ArrayList;
import java.util.List;

public class BigNumber {
    private int[] numArray;

    public BigNumber(String value) {
        numArray = new int[value.length()];
        for (int q = 0; q < value.length(); q++) {
            numArray[q] = Integer.parseInt(value.charAt(value.length()-1-q)+"");
        }
    }

    public BigNumber(long value) {
        this(""+value);
    }

    public BigNumber(int value) {
        this(""+value);
    }

    public BigNumber(int[] arr) {
        this.numArray = arr;
    }

    public int[] getArray() {
        return numArray;
    }

    public BigNumber add(BigNumber bg) {
        int carry = 0;
        int max = Math.max(numArray.length, bg.numArray.length);
        int[] newArr = new int[max];
        for (int q = 0; q < max; q++) {
            int a = q < numArray.length ? numArray[q] : 0;
            int b = q < bg.numArray.length ? bg.numArray[q] : 0;
            int c = a + b;
            newArr[q] = carry + c;
            if (newArr[q] >= 10) {
                carry = 1;
                newArr[q] -= 10;
            }else {
                carry = 0;
            }
        }
        if (carry > 0) {
            int[] newNewArr = new int[max+1];
            System.arraycopy(newArr, 0, newNewArr, 0, max);
            newNewArr[max] = 1;
            return new BigNumber(newNewArr);
        }
        return new BigNumber(newArr);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int q= 0; q < numArray.length; q++) {
            sb.append(numArray[numArray.length-1-q]);
        }
        return sb.toString();
    }
}
