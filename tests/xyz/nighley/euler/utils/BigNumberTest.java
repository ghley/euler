package xyz.nighley.euler.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigNumberTest {
    @Test
    public void testStr() {
        BigNumber num = new BigNumber("1234");
        assertEquals("1234", num.toString());
    }

    @Test
    public void testInt() {
        BigNumber num = new BigNumber(1234);
        assertEquals("1234", num.toString());
    }
    @Test
    public void testAdd() {
        BigNumber num1 = new BigNumber(9999);
        BigNumber num2 = new BigNumber(1);

        BigNumber num3 = num1.add(num2);
        assertEquals("10000", num3.toString());
    }
}