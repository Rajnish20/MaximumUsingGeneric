package com.magic.junitassertions;

import com.magic.generic.Maximum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {

    @Test
    public void givenThreeInteger_WithMaxAtFirstPlace_ShouldReturnMaximum() {
        Integer max = Maximum.maximum(5, 1, 3);
        Assertions.assertEquals(5, max);
    }

    @Test
    public void givenThreeInteger_WithMaxAtSecondPlace_ShouldReturnMaximum() {
        Integer max = Maximum.maximum(5, 9, 3);
        Assertions.assertEquals(9, max);
    }

    @Test
    public void givenThreeInteger_WithMaxAtThirdPlace_ShouldReturnMaximum() {
        Integer max = Maximum.maximum(5, 1, 10);
        Assertions.assertEquals(10, max);
    }

    @Test
    public void givenThreeFloat_WithMaxAtFirstPlace_ShouldReturnMaximum() {
        Float max = Maximum.maximum(5.5f, 1.8f, 2.9f);
        Assertions.assertEquals(5.5f, max);
    }

    @Test
    public void givenThreeFloat_WithMaxAtSecondPlace_ShouldReturnMaximum() {
        Float max = Maximum.maximum(5.5f, 10.8f, 2.9f);
        Assertions.assertEquals(10.8f, max);
    }

    @Test
    public void givenThreeFloat_WithMaxAtThirdPlace_ShouldReturnMaximum() {
        Float max = Maximum.maximum(5.5f, 10.8f, 20.0f);
        Assertions.assertEquals(20.0f, max);
    }

    @Test
    public void givenThreeStrings_WithMaxAtFirstPlace_ShouldReturnMaximum() {
        String max = Maximum.maximum("Peach", "Banana", "Apple");
        Assertions.assertEquals("Peach", max);
    }

    @Test
    public void givenThreeStrings_WithMaxAtSecondPlace_ShouldReturnMaximum() {
        String max = Maximum.maximum("Banana", "Peach", "Apple");
        Assertions.assertEquals("Peach", max);
    }

    @Test
    public void givenThreeStrings_WithMaxAtThirdPlace_ShouldReturnMaximum() {
        String max = Maximum.maximum("Banana", "Apple", "Peach");
        Assertions.assertEquals("Peach", max);
    }

    @Test
    public void givenThreeIntegersToClass_WithMaxAtFirstPlace_ShouldReturnMaximum()
    {
        Maximum max = new Maximum(3,2, 1);
        Assertions.assertEquals(3,max.testMaximum());
    }

    @Test
    public void givenThreeFloatToClass_WithMaxAtFirstPlace_ShouldReturnMaximum()
    {
        Maximum max = new Maximum(3.1f,2.1f, 1.1f);
        Assertions.assertEquals(3.1f,max.testMaximum());
    }

    @Test
    public void givenInteger_ShouldReturnMaximum() {
        Integer maxValue = Maximum.maximumValue(2, 3, 4, 1, 10, 9, 8);
        Assertions.assertEquals(10, maxValue);
    }

    @Test
    public void givenFloat_ShouldReturnMaximum() {
        Float maxValue = Maximum.maximumValue(1.1f, 2.1f, 10.1f, 8.9f, 4.5f);
        Assertions.assertEquals(10.1f, maxValue);
    }

    @Test
    public void givenStrings_ShouldReturnMaximum() {
        String maxValue = Maximum.maximumValue("Daniel", "Michael", "Harry", "Peter", "John");
        Assertions.assertEquals("Peter", maxValue);
    }
}
