package finalMaterial.week14_25Apr_tues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JMLExampleTest {

    @Test
    void plusOne() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    JMLExample.plusOne(-1);
                }, "should get exception if I pass a negative value");

        //test the postconditions and return of the method
        int back = JMLExample.plusOne(5);
        assertEquals(back, 6, "back should be 6");
    }

    @Test
    void doubleEach() {
    }

    @Test
    void mult() {
    }
}