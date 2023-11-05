package ui.goit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void returnsOneIfArgumentIsOne() {
        int result = sumCalculator.sum(1);
        assertEquals(1, result);
    }

    @Test
    void returnsSixIfArgumentIsThree() {
        int result = sumCalculator.sum(3);
        assertEquals(6, result);
    }

    @Test
    void throwsIllegalArgumentExceptionForZeroValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });
    }
}