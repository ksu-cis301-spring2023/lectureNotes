package finalMaterial.week14_27Apr_thurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JMLArraysTest {
    @Test
    void getStringLengths() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    JMLArrays.getStringLengths(null);
                }, "should get exception if passed in null");

        String[] test = {"ball", "cat", "hi"};
        int[] back = JMLArrays.getStringLengths(test);
        assertArrayEquals(new int[] {4,3,2}, back);
    }

    @Test
    void min() {
    }

    @Test
    void allAbs() {
    }

    /*
    assertEquals((test expression), (expected value),
        "message describing expected value");

     assertThrows(IllegalArgumentException.class,
                () -> {
                    methodCall(params);
                }, "should get exception if ...explain");

     assertArrayEquals(firstArray, secondArray);
     assertArrayEquals(new int[] {10,1,2,3,4,5,6,7,8,9}, test);
     */

}