package task01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test01 {

    Integer[] expectation;
    int[] input;

    public Test01(Integer[] expectation, int[] input) {
        this.expectation = expectation;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[] {1, 7}, new int[] {1, 2, 4, 4, 2, 3, 4, 1, 7}},
                {new Integer[] {}, new int[] {4}},
                {new Integer[] {}, new int[] {4, 4, 4}},
                {new Integer[] {7}, new int[] {1, 2, 4, 5, 4, 7}},
                {new Integer[] {}, new int[] {1, 2, 4, 5, 4, 7, 4}},
                {new Integer[] {8, 8}, new int[] {1, 2, 4, 8, 8}}
        });
    }

    @Test
    public void testProcessArray() {
        Assert.assertArrayEquals(expectation, Task01.processArray(input));
    }

}
