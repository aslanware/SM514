package org.sm514;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class LastZeroTest {
    private int[] input;
    private int lastIndex;

    public LastZeroTest(int[] a, int i) {
        input = a;
        lastIndex = i;
    }

    @Parameters
    public static Collection<Object[]> parameters () {
        return Arrays.asList(new Object[][] { { new int[] {1,1,1,0}, 3 }, { new int [] {1,1,0,0}, 3 } });
    }

    @Test
    public void lastZeroIndexTest() {
        assertEquals(lastIndex, LastZero.lastZero(input));
    }
}