package com.turleylabs.functional;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {
    private final Arithmetic arithmetic = new Arithmetic();

    @ParameterizedTest
    @CsvSource({"+ 1 1, 2"
            , "+ 17 18, 35"
            , "- 1 1, 0"
            , "- 17 18, -1"
            , "* 1 1, 1"
            , "* 17 18, 306"
            , "/ 2 1, 2"
            , "/ 20 5, 4"
    })
    public void verifyCalculations(String expression, int result) {
        assertEquals(result, arithmetic.doOperation(expression), expression);
    }
}
