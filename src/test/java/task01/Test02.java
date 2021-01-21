package task01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test02 {

    Integer[] expectation;
    int[] input;

    public Test02(Integer[] expectation, int[] input) {
        this.expectation = expectation;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[] {}, new int[] {}},
                {new Integer[] {}, new int[] {1, 1, 1}},
                {new Integer[] {}, new int[] {1, 2, 3, 5, 6, 7, 8, 9}}
        });
    }

    @Test(expected = RuntimeException.class)
    public void testProcessArray() {
        Assert.assertArrayEquals(expectation, Task01.processArray(input));
    }

}
