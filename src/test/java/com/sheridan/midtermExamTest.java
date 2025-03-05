package com.sheridan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class midtermExamTest {
    @Test
    public void testCalculatorAddition(){
        midtermExam newCalc = new midtermExam(14, 0);
        newCalc.addition(25);
        assertEquals(39, newCalc.getTotal());
    }
}