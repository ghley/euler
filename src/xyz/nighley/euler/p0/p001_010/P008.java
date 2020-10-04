package xyz.nighley.euler.p0.p001_010;

import xyz.nighley.euler.utils.BigNumber;
import xyz.nighley.euler.utils.Problem;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class P008 extends Problem {

    @Override
    public Object getResult() {
        return getMaxConsecutiveProduct(readFile(), 13);
    }

    public static long getMaxConsecutiveProduct(int[] arr, int num) {
        long[] mulArray = LongStream.range(0, arr.length+num).map(d->1).toArray();
        for (int r = 0; r < num; r++) {
            int index = r;
            IntStream.range(0, arr.length).forEach(i -> mulArray[i+index]*= arr[i]);
        }
        return Arrays.stream(mulArray).max().getAsLong();
    }

    public static int[] readFile() {
        try {
            String str = Files.readAllLines(Paths.get("resources/p008/file.txt")).stream().collect(Collectors.joining(""));
            BigNumber num = new BigNumber(str);
            return num.getArray();
        }catch (Throwable t) {
            t.printStackTrace();
        }
        throw new RuntimeException("This shouldn't happen");
    }
}
