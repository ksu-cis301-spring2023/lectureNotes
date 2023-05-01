package finalMaterial.week15_2May_tues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerminationTest {

    @Test
    void collatz() {
        int num = Termination.collatz(52);
        assertEquals(1, num, "should always get 1");
    }
}