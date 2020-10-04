package xyz.nighley.euler.p0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xyz.nighley.euler.p0.p011_020.P012;

public class P01Test {
    @Test
    public void P012() {
        Assertions.assertEquals(28, P012.getTriangleNumberWithOverXDivisors(5));
    }
}
