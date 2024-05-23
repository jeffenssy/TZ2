package test;

import main.num;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

public class testnum {
    private List<Integer> nums;

    @Before
    public void setUp() throws IOException {
        nums = num.readNumbersFromFile("test_20000.txt");
    }

    @Test
    public void testMax() {
        int max = nums.stream().max(Integer::compare).orElse(Integer.MIN_VALUE);
        Assert.assertEquals(max, num._max(nums));
    }

    @Test
    public void testMin() {
        int min = nums.stream().min(Integer::compare).orElse(Integer.MAX_VALUE);
        Assert.assertEquals(min, num._min(nums));
    }

    @Test
    public void testSum() {
        long sum = nums.stream().mapToLong(Integer::longValue).sum();
        Assert.assertEquals(sum, num._sum(nums));
    }

    @Test
    public void testMult() {
        BigInteger mult = nums.stream()
                .map(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        BigInteger actualMult = num._mult(nums);
        Assert.assertEquals(mult, actualMult);
    }
}
