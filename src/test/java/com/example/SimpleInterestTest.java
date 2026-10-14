
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleInterestTest {
    @Test
    void testInterest() {
        assertEquals(100.0,
            SimpleInterest.calculate(1000, 5, 2), 0.001);
    }

    @Test
    void testZeroRate() {
        assertEquals(0.0,
            SimpleInterest.calculate(1000, 0, 2), 0.001);
    }

    @Test
    void testZeroTime() {
        assertEquals(0.0,
            SimpleInterest.calculate(1000, 5, 0), 0.001);
    }
}
