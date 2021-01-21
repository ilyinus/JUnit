package task02;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task01.Task01;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test01 {

    boolean expectation;
    int[] input;

    public Test01(boolean expectation, int[] input) {
        this.expectation = expectation;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {true , new int[] {1, 1, 1, 4, 4, 1, 4, 4}},
                {false, new int[] {1, 1, 1, 1, 1, 1}},
                {false, new int[] {4, 4, 4, 4}},
                {false, new int[] {1, 4, 4, 1, 1, 4, 3}}
        });
    }

    @Test
    public void testProcessArray() {
        Assert.assertEquals(expectation, Task02.checkArray(input));
    }

}
