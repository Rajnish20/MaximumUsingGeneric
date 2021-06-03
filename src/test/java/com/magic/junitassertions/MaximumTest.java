package com.magic.junitassertions;

import com.magic.generic.Maximum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {

    @Test
    public void givenThreeInteger_WithMaxAtFirstPlace_ShouldReturnMaximum()
    {
        Integer max = Maximum.maximum(5, 1, 3);
        Assertions.assertEquals(5,max);
    }

    @Test
    public void givenThreeInteger_WithMaxAtSecondPlace_ShouldReturnMaximum()
    {
        Integer max = Maximum.maximum(5, 9, 3);
        Assertions.assertEquals(9,max);
    }

    @Test
    public void givenThreeInteger_WithMaxAtThirdPlace_ShouldReturnMaximum()
    {
        Integer max = Maximum.maximum(5, 1, 10);
        Assertions.assertEquals(10,max);
    }
}
