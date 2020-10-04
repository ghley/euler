package xyz.nighley.euler.p0.p011_020;

import xyz.nighley.euler.utils.BigNumber;
import xyz.nighley.euler.utils.Problem;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class P013 extends Problem {

    @Override
    public Object getResult() {
        return Arrays.stream(getData()).reduce((b1,b2)->b1.add(b2)).get().toString().substring(0, 10);
    }

    public static BigNumber[] getData() {
        try {
            return Files.readAllLines(Paths.get("resources/p013/data.txt")).stream().map(i -> new BigNumber(i)).toArray(BigNumber[]::new);
        }catch (Throwable t) {
            t.printStackTrace();
        }
        throw new RuntimeException("FAILED");
    }
}
